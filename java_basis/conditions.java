import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Age is: " + age);
        double n1 = 5.5;
        String str = "hi";

        //*Switch case
        /* 
        switch (n1) {
            case 1.0:
                break;
            default:
                break;
        }
        switch (str) {
            case "hi":
                
                break;
        
            default:
                break;
        }
                */

        //! loop
        int i = 11;
        do {
            System.out.println(i + " ");
            i++;
        } while (i<10); //11
    }
}
