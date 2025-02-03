import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayConverter {
    public void convertArray() {
        Scanner scanner = new Scanner(System.in);
        
        // Read input size
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        
        Integer[] array = new Integer[n];

        // Read array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Convert to ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("Converted to ArrayList: " + arrayList);

        // Convert back to Array
        Integer[] newArray = arrayList.toArray(new Integer[0]);
        System.out.println("Converted back to Array: " + Arrays.toString(newArray));
    }
}
