class Solution {
    public int findMin(int[] nums) {
        
int left = 0;
        int right = nums.length - 1;
        
        // If the array is not rotated, return the first element
        if (nums[left] <= nums[right]) {
            return nums[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if the mid element is the minimum
            if (nums[mid] > nums[right]) {
                // Minimum must be in the right half
                left = mid + 1;
            } else {
                // Minimum must be in the left half (including mid)
                right = mid;
            }
        }

        // At the end, left == right, pointing to the minimum
        return nums[left];
    }
}
