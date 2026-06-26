class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int currentOne = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) currentOne = 0;
            else {
                currentOne++;
                maxOne = Math.max(currentOne,maxOne);
            }
        }
        return maxOne;
    }
}