class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        for (int i = 1; i < nums.length + 1; i++) {
            int multiplePresent = 0;
            for (int j = 0; j < nums.length; j++) {
                if (k * i == nums[j]) multiplePresent++;
            }
            if (multiplePresent == 0) return k * i;
        }

        return nums[nums.length-1] + k; 
    }
}