import java.util.Scanner;
import java.util.Random;

public class NewGuessNumber {
    static Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int highScore = 10;

    public int playGame() {
        System.out.println("!!!Welcome to Guess Number Game!!!");
        System.out.println("A number from 1-100 is selected randomly and you have to guess the number correctly");
        System.out.println("You have 5 chances");
        final int compNumber = rand.nextInt(100) + 1; // (0-99) +1 = 1-100
        return result(compNumber);
    }

    int result(int compNumber) {
        int userGuess, attemps = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Chance-" + i + ", Guess a number");
            userGuess = sc.nextInt();
            attemps++;
            if (compNumber == userGuess) {
                System.out.println("Congrats, YOU WON ");
                System.out.println("Actual number is " + userGuess);
                return attemps;
            } else if (userGuess < compNumber) {
                System.out.println("Guessed number is smaller than actual number");
            } else {
                System.out.println("Guessed number is larger than actual number");
            }
        }
        System.out.println("YOU LOST!" + "\nYou run out of attemps");
        System.out.println("Actual Number is " + compNumber);
        return -1;
    }

    void highScore() {
        if (highScore > 0 && highScore <= 2) {
            System.out.println("WOW! High Score is " + highScore);
        } else if (highScore > 2 && highScore <= 4) {
            System.out.println("Good, High Score is " + highScore);
        } else if (highScore == 5) {
            System.out.println("Not Bad, High Score is " + highScore);
        } else {
            System.out.println("Not Played yet");
        }
    }

    public void menu() {

        do {
            System.out.println("MENU");
            System.out.println("1. Play Game" + "\n2. View HighScore" + "\n3. Exit");
            int userInput = sc.nextInt();
            if (userInput == 1) {
                int attemps = playGame();
                if (attemps != -1) {
                    System.out.println("Your Score: " + attemps);
                    if (attemps < highScore) {
                        highScore = attemps;
                        System.out.println("New High Score Set " + highScore);
                    } else {
                        System.out.println("Current High Score " + highScore);
                    }
                }
            } else if (userInput == 2) {
                highScore();

            } else if (userInput == 3) {
                break;
            } else {
                System.out.println("Invalid Input");
            }
        } while (true);
    }

    public static void main(String[] args) {
        NewGuessNumber game = new NewGuessNumber();
        game.menu();
    }
}
