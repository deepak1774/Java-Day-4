import java.util.Scanner;

public class ManageName {

    public static void manageNames(String[] names) {
       
        String longestName = names[0];
        String shortestName = names[0];
        
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
            if (name.length() < shortestName.length()) {
                shortestName = name;
            }
        }
        System.out.print("Names in Reverse Order: ");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
       
        System.out.println("Longest Name: " + longestName);
        System.out.println("Shortest Name: " + shortestName);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        System.out.println("Enter the names of 5 attendees:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        manageNames(names);
        scanner.close();
    }
}
