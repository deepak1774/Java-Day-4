import java.util.Scanner;

public class ManageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        int[][] scores = new int[numStudents][numSubjects];

        System.out.println("Enter the scores for each student:");
        String[] subjects = new String[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the name of subject " + (i + 1) + ": ");
            subjects[i] = scanner.next();
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %d:%n", i + 1);
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                scores[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Average scores for each student:");
        for (int i = 0; i < numStudents; i++) {
            double total = 0;
            for (int j = 0; j < numSubjects; j++) {
                total += scores[i][j];
            }
            double average = total / numSubjects;
            System.out.printf("Student %d: %.2f%n", i + 1, average);
        }
        System.out.println("Average scores for each subject:");
        for (int j = 0; j < numSubjects; j++) {
            double total = 0;
            for (int i = 0; i < numStudents; i++) {
                total += scores[i][j];
            }
            double average = total / numStudents;
            System.out.printf("%s: %.2f%n", subjects[j], average);
        }
        scanner.close();
    }
}
