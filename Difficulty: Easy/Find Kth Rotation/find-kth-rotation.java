class Solution {
    public int findKRotation(int nums[]) {
        // Code here
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[low] <= nums[mid]) {
                if (nums[low] < ans) {
                    ans = nums[low];
                    index = low;
                }
                low = mid + 1;
            } else {
                if (nums[mid] < ans) {
                    ans = nums[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }
}