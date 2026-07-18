class Solution {
    void nextPermutation(int[] nums) {
        // code here
        int breakPoint = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i+1] > nums[i]) {
                breakPoint = i;
                break;
            }
        }
        if (breakPoint == -1) {
            reverse(nums,0,nums.length-1);
            return;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > nums[breakPoint]) {
                int temp = nums[i];
                nums[i] = nums[breakPoint];
                nums[breakPoint] = temp;
                break;
            }
        }
        reverse(nums,breakPoint+1,nums.length-1);
        return;
    }
    public void reverse(int[] arr,int start,int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}