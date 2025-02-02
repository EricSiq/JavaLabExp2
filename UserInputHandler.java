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

}
