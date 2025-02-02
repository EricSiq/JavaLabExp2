public class Main {
    public static void main(String[] args) {
        // Initialize classes
        UserInputHandler inputHandler = new UserInputHandler();
        EvenOddSeparator evenOddSeparator = new EvenOddSeparator();
        SmallestNeighborDistanceFinder distanceFinder = new SmallestNeighborDistanceFinder();
        ArrayConverter arrayConverter = new ArrayConverter();

        int choice;
        do {
            choice = inputHandler.getUserChoice(); // Get user choice
            switch (choice) {
                case 1 -> evenOddSeparator.execute(inputHandler); // Separate even/odd
                case 2 -> distanceFinder.execute(inputHandler); // Find closest pair
                case 3 -> arrayConverter.execute(inputHandler); // Convert array/list
                case 4 -> System.out.println("Exiting..."); // Exit message
                default -> System.out.println("Invalid choice. Try again."); // Invalid input
            }
        } while (choice != 4); // Loop until exit
    }
}
