class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = Integer.MIN_VALUE;
        int preProd = 1;
        int backProd = 1;
        for (int i = 0; i < nums.length; i++) {
            if (preProd == 0) preProd = 1;
            if (backProd == 0) backProd = 1;
            preProd *= nums[i];
            backProd *= nums[nums.length - 1 - i];
            maxProd = Math.max(Math.max(preProd,backProd),maxProd);
        }
        return maxProd;
    }
}