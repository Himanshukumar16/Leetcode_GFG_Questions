class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = nums.length;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            boolean bool = isPossible(nums, mid, target);
            if (bool) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }
    boolean isPossible(int[] nums, int mid, int target) {
        int i = 0;
        int j = i + mid;
        int sum = 0;
        for (int k = i; k < j; k++) {
            sum += nums[k];
            if (sum >= target) return true;
        }
        for (int k = j; k < nums.length; k++) {
            sum -= nums[i];
            sum += nums[k];
            if (sum >= target) return true;
            i++;
        }
        return false;
    }
}