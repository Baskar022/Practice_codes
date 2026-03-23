import java.time.LocalDateTime;
import java.util.List;

interface Payable {
	void paySalary(double amount);
}

interface Taxable {
 	 void getTax(double salary);

 	default void IRS(String SSN, String fillingStatus, String name, String address) {
 		System.out.println("-----IRS Form-----");
 		System.out.println("TaxpayerLegal Name: " + name);
 		System.out.println("Social Security Number: " + SSN);
 		System.out.println("Fillng Status: " + fillingStatus);
 		System.out.println("Taxpayer Address: " + address);
 		System.out.println("Last Update: " + timestamp());
 	}

 	private String timestamp() {
 		String stamp = LocalDateTime.now().toString();
 		return stamp;
 	}
}

interface AccessControl {

	interface SystemRoles {
		boolean databaseAccess ();
	}

	interface PhysicalRoles {
		boolean officeAccess();
	}
}

 interface HighlyClassified {}

@FunctionalInterface
interface PersonalFilter {
	boolean filter(Employee staff);
}
abstract class Employee implements Payable {
	
 	private String name;
    private String UID;
   private double salary;

   public String getName() {
	return name;
   }
   public void setName(String name) {this.name = name;}
   public String getUID() {
	return UID;
   }

   public double getSalary () { return salary;}
   public void setSalary (double salary) { this.salary = salary;}

   public Employee(String name, String UID, double salary){
   	this.name = name;
   	this.UID = UID;
   	this.salary = salary;
   }
}
class FTEmployee extends Employee implements Payable, Taxable, AccessControl.PhysicalRoles, AccessControl.SystemRoles {
 	@Override
 	public void paySalary(double salary){
 		System.out.println(getName() + " salary is " + salary);
 	}
 	@Override
 	public void getTax (double salary) {
 		double totalTax = salary * 0.10;
 		System.out.println(getName() + " Total Tax is " + totalTax);
 	}

	public FTEmployee (String name, String UID, double salary) {
		super(name, UID, salary);
	} 


}

class ContractEmployee extends Employee implements Payable, Taxable, AccessControl {
  
   private int duration;
   public int getDuration() {return duration;}
   public void setDuration(int time){ this.duration = time;}
   @Override
 	public void paySalary(double salary){
 		System.out.println(getName() + " salary is " + salary);
 	}
 	@Override
 	public void getTax (double salary) {
 		double totalTax = salary * 0.10;
 		System.out.println(getName() + " Total Tax is " + totalTax);
 	}

	public ContractEmployee (String name, String UID, double salary) {
		super( name, UID, salary);
	}
}

class AIAgents extends Employee implements Payable, AccessControl {

   private int duration;
   public int getDuration() {return duration;}
   public void setDuration(int time){this.duration = time;}
   @Override
 	public void paySalary(double salary){
 		System.out.println(getName() + " salary is " + salary);
 	}

	public AIAgents (String name, String UID, double salary){
		super(name, UID, salary);
	}
}

public class HRSystem {

	public static void main(String[] args) {
		List<Employee> staffs = List.of(new FTEmployee("John", "100", 150000), new AIAgents("GPT", "200", 95000), new ContractEmployee("Brock", "151", 75000));
			PersonalFilter highSalaryEarner = emp -> emp.getSalary() > 100000;
		  for (Employee e : staffs) {
			if (highSalaryEarner.filter(e)) {
				System.out.println("ALERT: " + e.getName() + "is High Earner & his salary is" + e.getSalary());
			}
			e.paySalary(e.getSalary());
			if (e instanceof Taxable) {
				((Taxable) e).IRS("000-00-0000", "Single", e.getName(), "HQ Vault");
			}
			if( e instanceof HighlyClassified)
					System.out.println(e.getName() + " is Highly Classified");
		  }

	}
}