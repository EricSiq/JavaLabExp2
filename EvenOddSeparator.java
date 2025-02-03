import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddSeparator {
    public void separateEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        
        // Read input size
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        
        // Initialize lists
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        // Read numbers and categorize them
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        // Display results
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
