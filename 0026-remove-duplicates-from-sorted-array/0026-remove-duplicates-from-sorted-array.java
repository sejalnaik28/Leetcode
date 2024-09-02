
public class Solution {
    public int removeDuplicates(int[] nums) {
        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueElements = new HashSet<>();

        // Index to place unique elements in the array
        int index = 0;

        // Iterate through the array and add elements to the HashSet
        for (int num : nums) {
            // Add the number to the HashSet if it's not already present
            if (!uniqueElements.contains(num)) {
                uniqueElements.add(num);  // Add to the set
                nums[index] = num;        // Place the unique number at the current index
                index++;                  // Increment index
            }
        }

        // Return the number of unique elements
        return index;
    }
}