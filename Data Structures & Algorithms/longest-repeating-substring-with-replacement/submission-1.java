class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int res = 0;
        int[] count = new int[26];
        int maxCount = 0;
        
        for(int right =0; right < s.length(); right++){
            char rightChar = s.charAt(right);
            count[rightChar - 'A']++;
            maxCount = Math.max(maxCount, count[rightChar - 'A']);
            
            while((right - left + 1) - maxCount > k){
                char leftChar = s.charAt(left);
                count[leftChar - 'A']--;
                left++;
                
            }
            res = Math.max(res, right - left + 1);    
        }   
        return res;  
    }
}
