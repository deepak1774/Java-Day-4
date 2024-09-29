import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreetingStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> studentNames = new ArrayList<>();
        
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter the names of the students:");
        for (int i = 0; i < numStudents; i++) {
            String name = scanner.nextLine();
            studentNames.add(name);
        }
        for (String name : studentNames) {
            System.out.println("Oii, " + name + "!");
        }
        scanner.close();
    }
}
