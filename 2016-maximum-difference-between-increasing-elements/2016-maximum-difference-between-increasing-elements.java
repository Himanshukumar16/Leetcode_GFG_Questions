class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = 0;
        for (int i = 0; i < nums.length-1; i++) {
            int j = i + 1;
            while (j < nums.length) {
                int diff = nums[j] - nums[i];
                maxDiff = Math.max(diff, maxDiff);
                j++;
            }
        }
        return (maxDiff == 0) ? -1 : maxDiff;
    }
}