import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConverter {
    // Convert array to list
    public ArrayList<Integer> convertArrayToList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) list.add(num);
        return list;
    }
    
    // Convert list to array
    public int[] convertListToArray(ArrayList<Integer> list) {
        return list.stream().mapToInt(i -> i).toArray();
    }

    // Execute method
    public void execute(UserInputHandler inputHandler) {
        int[] array = inputHandler.getNumbersFromUser(); // Get input
        ArrayList<Integer> list = convertArrayToList(array); // Convert
        System.out.println("ArrayList: " + list);
        System.out.println("Array: " + Arrays.toString(convertListToArray(list)));
    }
}
