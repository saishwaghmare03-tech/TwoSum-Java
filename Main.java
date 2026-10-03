import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solver = new Solution();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solver.twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // Output: [0, 1]
    }
}
