class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        // First pass to find the candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Second pass to verify the candidate (optional since majority element always exists)
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        
        // Since the problem states the majority element always exists, we return the candidate
        return candidate;
    





    }
}