class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroes = 0;
        int maxOne = 0;

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                zeroes++;
                while (zeroes > k) {
                    if (nums[i] == 0) {
                        zeroes--;
                    }
                    i++;
                }
            }
            maxOne = Math.max(maxOne, j - i + 1);
        }
        return maxOne;
    }
}