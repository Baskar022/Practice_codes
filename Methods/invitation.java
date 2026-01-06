import java.util.Scanner;

abstract class Greet {
   abstract void greeting(String name);
}

public class invitation extends Greet {
    Scanner sc = new Scanner(System.in);

   @Override
   void greeting(String name) {
      System.out.println("Hello " + name + "\nKeep Learning👍");
   }

   public static void main(String[] args) {
      
      invitation obj = new invitation();
      System.out.println("Enter your name");
      // String name = sc.nextLine();
      
      String name = obj.sc.nextLine();
      obj.greeting(name);
   }
}