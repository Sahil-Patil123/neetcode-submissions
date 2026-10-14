class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int right = 0; right < fruits.length; right++){
            int rightFruit = fruits[right];
            map.put(rightFruit, map.getOrDefault(rightFruit, 0) + 1);

            while(map.size() > 2){
                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);
                left++;
                if(map.get(leftFruit) == 0){
                    map.remove(leftFruit);
                }
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}