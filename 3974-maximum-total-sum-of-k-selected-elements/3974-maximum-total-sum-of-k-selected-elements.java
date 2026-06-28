class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        // for (int i : nums) System.out.println(i);
        long sum = 0;
        int j = 0;
        while (j < k) {
            long max = nums[nums.length - 1 - j];
            if (mul <= 0) sum += max;
            else sum += (long)(max * mul);
            // System.out.println(sum);
            mul--;
            j++;
        }
        return sum;
    }
}