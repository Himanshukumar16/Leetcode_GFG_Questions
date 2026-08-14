class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int i : piles) if (max < i) max = i;
        int low = 1;
        int high = max;
        int ans = -1;
        while (low <= high) {
            int mid = low +(high - low) / 2;
            long s = totalBananaEaten(mid, piles);
            if (s <= h) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }
    long totalBananaEaten(int mid, int[] nums) {
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] + mid - 1) / mid;
        }
        return sum;
    }
}