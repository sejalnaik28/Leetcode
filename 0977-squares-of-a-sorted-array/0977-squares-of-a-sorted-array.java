class Solution {
 
       public static int[] sortedSquares(int[] nums) {
        // Array to store the result
        int[] result = new int[nums.length];

        // Pointers for the left and right ends of the array
        int left = 0;
        int right = nums.length - 1;

        // Position to fill the result array from the end
        int index = nums.length - 1;

        // Loop until left and right pointers cross
        while (left <= right) {
            // Square the elements at the current left and right pointers
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            // Compare the squares and place the larger one at the current index
            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            // Move to the next position in the result array
            index--;
        }

        return result;
    }

}