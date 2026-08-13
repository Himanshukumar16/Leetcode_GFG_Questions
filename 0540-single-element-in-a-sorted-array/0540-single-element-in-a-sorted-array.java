class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length - 1;
        int low = 0;
        int high = n;
        if (n == 0) return nums[0];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == 0 && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            if (mid == n && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[mid] != nums [mid-1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            if ((mid % 2 == 1 && nums[mid] == nums[mid-1]) || (mid % 2 == 0 && nums[mid] == nums[mid+1])) low = mid + 1;
            if ((mid % 2 == 1 && nums[mid] == nums[mid+1]) || (mid % 2 == 0 && nums[mid] == nums[mid-1])) high = mid - 1;
        }
        return 0;
    }
}