class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int productPos = nums[0];
        int productNeg = nums[0];
        for(int i = 1; i < nums.length; i++){
            int v1 = productPos * nums[i];
            int v2 = productNeg * nums[i];
            int v3 = nums[i];
            productPos = Math.max(v1, Math.max(v2, v3));
            productNeg = Math.min(v1, Math.min(v2, v3));
            res = Math.max(res, Math.max(productPos, productNeg));

        }
        return res;
    }
}
