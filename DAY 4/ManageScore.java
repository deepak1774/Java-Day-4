import java.util.Scanner;

public class ManageScore {

    public static void manageScores(int[] scores) {
       
        double averageScore = 0;
        int highestScore = scores[0];
        int lowestScore = scores[0];
        
        for (int score : scores) {
            averageScore += score;
            if (score > highestScore) {
                highestScore = score;
            }
            if (score < lowestScore) {
                lowestScore = score;
            }
        }
        
        averageScore /= scores.length;
        
        System.out.print("Scores: ");
        for (int score : scores) {

            System.out.print(score + " ");
        }
        System.out.println();
        System.out.printf("Average Score: %.1f%n", averageScore);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];

        System.out.println("Enter the scores of 5 students:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        manageScores(scores);
        scanner.close();
    }
}
