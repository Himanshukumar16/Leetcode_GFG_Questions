class Solution {
    public int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr[arr.length - 1];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[low] <= arr[mid]) {
                ans = Math.min(arr[low], ans);
                low = mid + 1;
            } else {
                ans = arr[mid];
                high = mid - 1;
            }
        }
        return ans;
    }
}