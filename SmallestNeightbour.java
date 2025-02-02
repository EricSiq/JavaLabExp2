public class SmallestNeighbor {
    // Find smallest difference index
    public int findSmallestDistancePairIndex(int[] numbers) {
        if (numbers.length < 2) return -1; // Handle small input
        
        int minIndex = 0, minDiff = Math.abs(numbers[1] - numbers[0]); // Initialize
        
        for (int i = 1; i < numbers.length - 1; i++) {
            int diff = Math.abs(numbers[i + 1] - numbers[i]); // Compute difference
            if (diff < minDiff) { // Update if smaller
                minDiff = diff;
                minIndex = i;
            }
        }
        return minIndex;
    }

}
