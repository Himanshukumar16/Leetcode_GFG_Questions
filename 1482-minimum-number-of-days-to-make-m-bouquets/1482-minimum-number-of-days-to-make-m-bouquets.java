class Solution {
    public int minDays(int[] nums, int m, int k) {
        if (nums.length < (long)m * k) return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE; 
        for (int i : nums) {
            if (min > i) min = i;
            if (max < i) max = i;
        }
        int low = min;
        int high = max;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int bloomNumber = flowerBloom(mid, nums, k);
            if (bloomNumber >= m) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }
    int flowerBloom(int mid, int[] nums, int k) {
        int ans = 0;
        int cnt = 0;
        for (int i : nums) {
            if (i <= mid) cnt++;
            else {
                ans += cnt / k;
                cnt = 0;
            }
        }
        ans += cnt / k;
        return ans;
    }
}