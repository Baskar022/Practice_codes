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

public interface HighlyClassified {}

@FunctionalInterface
interface PersonalFilter {
	boolean filter(Employee staff);
}

class Emplooyee {
	@Getter @Setter
 	private String name;
 	@Getter
    private String UID;
    @Getter @Setter
   private double salary;

   public Emplooyee(String name, String UID, double salary){
   	this.name = name;
   	this.UID = UID;
   	this.salary = salary;
   }
}
class FTEmployee extends Emplooyee implements Payable, Taxable, AccessControl.PhysicalRoles, AccessControl.SystemRoles {
 	@Override
 	public void paySalary(double salary){
 		System.out.println(getName() + " salary is " + salary);
 	}
 	@Override
 	public void getTax (double salary) {
 		double totalTax = salary * 0.10;
 		System.out.println(getName() + " Total Tax is " + totalTax);
 	}


}

class ContractEmployee extends Emplooyee implements Payable, Taxable, AccessControl {
   @Getter @Setter
   priavte duration;
   @Override
 	public void paySalary(double salary){
 		System.out.println(getName() + " salary is " + salary);
 	}
 	@Override
 	public void getTax (double salary) {
 		double totalTax = salary * 0.10;
 		System.out.println(getName() + " Total Tax is " + totalTax);
 	}
}

class AIAgents extends Emplooyee implements Payable, AccessControl {
	@Getter @Setter
   priavte duration;
   @Override
 	public void paySalary(double salary){
 		System.out.println(getName() + " salary is " + salary);
 	}
}

public class HRSystem {

	public static void main(String[] args) {
		List<Employee> staffs = {new FTEmployee("John", "100", 150000), new AIAgents("GPT", "200", 95000), new ContractEmployee("Brock", "151", 75000)};
		
	}
}