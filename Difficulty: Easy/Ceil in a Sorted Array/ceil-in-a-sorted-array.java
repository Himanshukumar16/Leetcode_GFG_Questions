class Solution {
    public int findCeil(int[] nums, int x) {
        // code here
        return ceil(nums, x);
    }
    public int ceil(int[] arr, int x) {
        int ceil = - 1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                high = mid - 1;
                ceil = mid;
            } else low = mid + 1;
        }
        return (ceil);
    }
}
