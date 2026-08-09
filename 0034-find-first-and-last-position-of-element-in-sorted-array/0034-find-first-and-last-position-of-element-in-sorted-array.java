class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = first(nums, target);
        int last = last(nums, target);
        return new int[]{first,last};
    }
    public int first(int[] arr, int t) {
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == t) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] > t) high = mid - 1;
            else low = mid + 1;
        }
        return first;
    }
    public int last(int[] arr, int t) {
        int low = 0;
        int high = arr.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == t) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < t) low = mid + 1;
            else high = mid - 1;
        }
        return last;
    }
}