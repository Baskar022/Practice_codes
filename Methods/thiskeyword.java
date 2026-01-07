import java.util.Scanner;
public class thiskeyword {
    int Score = 100;
    static Scanner sc = new Scanner(System.in);
    public thiskeyword(int StartScore) {
        
        System.out.println("Score before this Match: " + Score);
        System.out.println("This match score: " + StartScore);
        afterMatch(StartScore);
    }
    void afterMatch (int Score) {
        
        this.Score += Score;
        System.out.println("Total career score: " + this.Score);
    }
    public static void main(String[] args) {
        System.out.println("Enter this match Score: ");
        int score = sc.nextInt();
        thiskeyword obj = new thiskeyword(score);
        

    }
}
