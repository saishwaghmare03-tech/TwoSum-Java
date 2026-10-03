class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Look at every pair of numbers using two loops
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                
                // Check if the current two numbers add up to the target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // Found the positions!
                }

            }
        }
        
        return new int[] {}; // Return empty if no match is found
    }
}
