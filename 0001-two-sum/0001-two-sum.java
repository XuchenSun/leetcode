
import java.lang.reflect.Array;
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Create a copy of the array with indices
        int[][] numbersWithIndices = new int[numbers.length][2];
        for (int i = 0; i < numbers.length; i++) {
            numbersWithIndices[i] = new int[]{numbers[i], i};
        }
        
        // Sort the array based on values
        Arrays.sort(numbersWithIndices, (a, b) -> Integer.compare(a[0], b[0]));
        
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbersWithIndices[left][0] + numbersWithIndices[right][0];
            if (sum == target) {
                return new int[]{numbersWithIndices[left][1], numbersWithIndices[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[0]; // Return empty array if no solution found
    }
}
