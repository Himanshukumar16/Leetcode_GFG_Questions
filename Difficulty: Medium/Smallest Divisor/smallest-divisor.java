class Solution {
    int smallestDivisor(int[] nums, int limit) {
        // Code here
        int max = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > max) max = i;
        }
        int low = 1;
        int high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int s = sumOfDivision(mid,nums);
            if (s <= limit) {
                ans = mid;
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    int sumOfDivision(int mid,int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += Math.ceil((double)i/mid);
        }
        return sum;
    }
}