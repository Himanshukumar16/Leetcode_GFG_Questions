class Solution {
    public int aggressiveCows(int[] nums, int k) {
        // code here
        Arrays.sort(nums);
            int max = nums[nums.length - 1];
            int min = nums[0];
            int low = 1;
            int high = max-min;
            int ans = 0;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (canPlace(nums, mid, k)) {
                    low = mid + 1;
                    ans = mid;
                } else high = mid - 1;
            }
            return ans;
        }
        boolean canPlace(int[] arr, int gap,int totalCowPresent) {
            int cntCow = 1;
            int lastElement = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - lastElement >= gap) {
                    cntCow++;
                    lastElement = arr[i];
                }
            }
            return (cntCow >= totalCowPresent);
    }
}