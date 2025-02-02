import java.util.Scanner;

public class UserInputHandler {
    private Scanner scanner = new Scanner(System.in); // Scanner object

    // Get numbers from user
    public int[] getNumbersFromUser() {
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) numbers[i] = scanner.nextInt(); // Read input
        return numbers;
    }
    
    // Get menu choice
    public int getUserChoice() {
        System.out.println("\nSelect operation:");
        System.out.println("1. Separate Even & Odd");
        System.out.println("2. Find Smallest Neighboring Difference");
        System.out.println("3. Convert Array ↔ ArrayList");
        System.out.println("4. Exit");
        System.out.print("Choice: ");
        return scanner.nextInt();
    }
}
