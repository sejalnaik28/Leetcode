class Solution {
  public static void rotate(int[] nums, int k) {
        // Handle cases where k is larger than the length of the array
        k = k % nums.length;
        
        // Reverse the entire array
        reverse(nums, 0, nums.length - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the rest of the array
        reverse(nums, k, nums.length - 1);
    }
    
    // Helper method to reverse elements in the array between start and end indices
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}