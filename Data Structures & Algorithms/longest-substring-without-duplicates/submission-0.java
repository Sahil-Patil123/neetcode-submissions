class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for(int right = 0; right < s.length(); right++){
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            
            while(map.size() < right - left + 1){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }
            res = Math.max(res, right - left + 1);


        }
        return res;
    }
}
