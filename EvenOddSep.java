import java.util.ArrayList;

public class EvenOddSep {
    private ArrayList<Integer> evenNumbers = new ArrayList<>();
    private ArrayList<Integer> oddNumbers = new ArrayList<>();

    // Categorize numbers
    public void categorizeNumbers(int[] numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) evenNumbers.add(number); // Add to even list
            else oddNumbers.add(number); // Add to odd list
        }
    }

    // Display results
    public void displayResults() {
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }

    // Execute method
    public void execute(UserInputHandler inputHandler) {
        categorizeNumbers(inputHandler.getNumbersFromUser()); // Get input
        displayResults(); // Show results
    }
}
