class Solution {
    static int findFloor(int[] nums, int x) {
        // code here
        return floor(nums, x);
    }
    public static int floor(int[] arr, int x) {
        int floor = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x) {
                low = mid + 1;
                floor = mid;
            } else high = mid - 1;
        }
        return floor;
    }
}
