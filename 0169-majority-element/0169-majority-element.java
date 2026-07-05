class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int el = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                el = nums[i];
                count = 1;
            } else if (nums[i] == el) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == el) {
                count++;
            }
        }
        if (count > nums.length / 2) return el;
        return -1;
    }
}