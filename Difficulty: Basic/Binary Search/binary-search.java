class Solution {
    public boolean binarySearch(int[] nums, int k) {
        // code here
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > k) high = mid - 1;
            else if (nums[mid] < k) low = mid + 1;
            else return true;
        }
        return false;
    }
}