import java.util.Scanner;
public class thiskeyword {
    int Score = 100;
    static Scanner sc = new Scanner(System.in);
    public thiskeyword(int StartScore) {
        
        System.out.println("Score before this Match: " + Score);
        Score = StartScore;
        afterMatch(Score);
    }
    void afterMatch (int Score) {
        System.out.println("This match score: " + Score);
        this.Score = Score;
        System.out.println("Total career score: " + this.Score);
    }
    public static void main(String[] args) {
        System.out.println("Enter this match Score: ");
        int score = sc.nextInt();
        thiskeyword obj = new thiskeyword(score);
        

    }
}
