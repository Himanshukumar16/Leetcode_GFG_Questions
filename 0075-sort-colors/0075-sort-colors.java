class Solution {
    public int[] sortColors(int[] nums) {
        int startptr = 0;
        int endptr = nums.length - 1;
        int iterator = 0;

        while(iterator <= endptr) {
            if (nums[iterator] == 0) {
                int temp = nums[startptr];
                nums[startptr] = 0;
                nums[iterator] = temp;
                startptr++;
                iterator++;
            } else if (nums[iterator] == 2) {
                int temp = nums[endptr];
                nums[endptr] = 2;
                nums[iterator] = temp;
                endptr--;
            } else {
                iterator++;
            }
        }
        return nums;
    }
}