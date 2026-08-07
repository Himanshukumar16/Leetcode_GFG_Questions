class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int longest = 1;
        int currLen = 0;
        int lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == lastSmaller + 1) {
                lastSmaller = nums[i];
                currLen++;
            }
            else if(nums[i] == lastSmaller) continue; 
            else {
                lastSmaller = nums[i];
                currLen = 1;
            }
            longest = Math.max(currLen , longest);
        }
        return longest;
    }
}