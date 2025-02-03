import java.util.Scanner;

public class SmallestNeighbor{
    public void findSmallestDistance() {
        Scanner scanner = new Scanner(System.in);
        
        // Read input size
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find smallest neighboring difference
        int minDiff = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                index = i;
            }
        }

        // Display result
        System.out.println("Smallest neighboring difference is at index: " + index);
    }
}
