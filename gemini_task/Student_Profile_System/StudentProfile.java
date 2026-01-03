import java.util.Scanner;

public class StudentProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oldStudent = 0, activeStudent = 0;
        int totalStudent = 0;

        do {
            System.out.println("1. Enter Student Details");
            System.out.println("2. Exit");
            int option = sc.nextInt();

            if (option == 1) {
                System.out.println("Enter Student Active Status (true or false): ");
                boolean isActive = sc.nextBoolean();

                if (isActive) {
                    System.out.println("Enter GPA:");
                    double GPA = sc.nextDouble();
                    System.out.println("Enter Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Enter Roll No.: ");
                    int roll = sc.nextInt();
                    char grade;
                    System.out.println("Enter Expected Grade: ");
                    char expectedGrade = sc.next().charAt(0);

                    if (GPA >= 9.0 && GPA <= 10.0) {
                        grade = 'A';
                    } else if (GPA >= 7.5 && GPA < 9.0) {
                        grade = 'B';
                    } else if (GPA >= 6.0 && GPA < 7.5) {
                        grade = 'C';
                    } else if (GPA >= 0.0 && GPA < 6.0) {
                        grade = 'F';
                    } else {
                        System.out.println("Invalid Input for GPA");
                        grade = 'F';
                    }

                    System.out.println("=".repeat(40));
                    System.out.println("STUDENT PROFILE SYSTEM V1.0");
                    System.out.println("=".repeat(40));
                    System.out.println("Name:     " + name);
                    System.out.println("Roll no.: " + roll);
                    System.out.println("GPA:      " + GPA);
                    System.out.println("Grade:    " + grade);
                    System.out.println("Active:   " + isActive);
                    System.out.println("=".repeat(40));
                    System.out.println("Expected Grade: " + expectedGrade + ", Grade Acheived: " + grade);
                    activeStudent++;
                } else {
                    System.out.println("STUDENT SUSPENDED OR OLD STUDENT");
                    oldStudent++;
                }
            } else if (option == 2) {
                totalStudent = oldStudent + activeStudent;
                System.out.println("Students Processed:");
                System.out.println(
                        "Old Student = " + oldStudent + "\nActive Student = " + activeStudent + "\nTotal Student = "
                                + totalStudent);
                System.out.println("Thank You");
                break;
            }
            else {
                System.out.println("Invalid Input");
                continue;
            }
        } while (true);

    }
}