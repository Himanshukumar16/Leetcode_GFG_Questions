class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == sumOfDigit(nums[i])) return i;
        }
        return -1;
    }
    int sumOfDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int last = n % 10;
            sum += last;
            n = n / 10;
        }
        return sum;
    }
}