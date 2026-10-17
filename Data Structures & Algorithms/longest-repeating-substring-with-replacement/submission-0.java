class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        int res = 0;

       for(int right = 0; right < s.length(); right++){
        char rightChar = s.charAt(right);
        map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
        count = Math.max(count, map.get(rightChar));

        while((right - left +1) - count > k){
            char leftChar = s.charAt(left);
            map.put(leftChar, map.get(leftChar) - 1);
            left++;
        }
        res = Math.max(res, right - left + 1);

       }
       return res;
    }
}
