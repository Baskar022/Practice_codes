import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        do {
            System.out.println("1. Play");
            System.out.println("2. Exit");
            int input = sc.nextInt();

            one: if (input == 1) {
                int compNumber = rand.nextInt(100) + 1;
                boolean hasWon = false;
                System.out.println("!!Welcome to Guess Number!!");
                System.out.println("A number is choosen between 1-100");
                System.out.println("You have 5 chances to guess correct number");

                for (int i = 1; i <= 5; i++) {
                    System.out.println("Chance-" + i + ", Guess Number: ");
                    int userGuess = sc.nextInt();
                    if (userGuess == compNumber) {
                        System.out.println("Congratulations!! YOU WON \n" + userGuess + " is the Actual Number");
                        // break one; return;
                        hasWon = true;
                        break;
                    } else if (userGuess < compNumber) {
                        System.out.println(userGuess + " is Smaller than Actual Number");
                    } else {
                        System.out.println(userGuess + " is Greater than Actual Number");
                    }
                }
                if (hasWon == false) {
                    System.out
                            .println("Opps, You ran out of chances \nYOU LOST!! \nThe Actual Number is: " + compNumber);
                }
            } else if (input == 2) {
                System.out.println("Come Back Soon");
                break;
            } else {
                System.out.println("Invalid Input");
                continue;
            }
        } while (true);
    }
}
