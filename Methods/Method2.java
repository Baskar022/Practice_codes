import java.util.Scanner;
public class Method2 {
    static Scanner sc = new Scanner(System.in);
    //! PIV get set
    private double GPA =  8.45;

    public void setGPA ( double updation) {
        GPA = updation;
    }

    double getGPA() {
        return GPA;
    } 

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String name = Method2.sc.nextLine();
        System.out.println("Enter the updated GPA: ");
        double updated = Method2.sc.nextDouble();

        Method2 obj = new Method2();
        obj.setGPA(updated);
        double newGPA = obj.getGPA();
        System.out.println("Name: " + name + "\nUpdated GPA: " + newGPA);

    }
}
