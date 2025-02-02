import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConverter {
    // Convert array to list
    public ArrayList<Integer> convertArrayToList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) list.add(num);
        return list;
    }

}
