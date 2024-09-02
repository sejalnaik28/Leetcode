public class Solution 
 {
    public int lengthOfLongestSubstring(String s) {
    
        HashSet<Character> home = new HashSet<>();
        int maxLength = 0;
        int left = 0; 

       
        for (int right = 0; right < s.length(); right++) {
        
            while(home.contains(s.charAt(right))) {
               
                home.remove(s.charAt(left));
                left++;
            }
           
            home.add(s.charAt(right));
            
            maxLength = Math.max(maxLength, right - left + 1);
        }

        
        return maxLength;
    }
    
}