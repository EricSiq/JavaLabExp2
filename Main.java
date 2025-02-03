import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize objects
        EvenOddSeparator evenOddSeparator = new EvenOddSeparator();
        SmallestNeighborDistanceFinder distanceFinder = new SmallestNeighborDistanceFinder();
        ArrayConverter arrayConverter = new ArrayConverter();

        int choice;
        do {
            // Display menu
            System.out.println("\nSelect an operation:");
            System.out.println("1. Separate Even & Odd");
            System.out.println("2. Find Smallest Neighboring Difference");
            System.out.println("3. Convert Array ↔ ArrayList");
            System.out.println("4. Exit");

            System.out.print("Choice: ");
            choice = scanner.nextInt();

            // Execute based on choice
            switch (choice) {
                case 1:
                    evenOddSeparator.separateEvenOdd();
                    break;
                case 2:
                    distanceFinder.findSmallestDistance();
                    break;
                case 3:
                    arrayConverter.convertArray();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
}
