class Solution {
    public int peakElement(int[] arr) {
        // code here
        int n = arr.length - 1;
        if (n == 0 || arr[0] > arr[1]) return 0;
        if (arr[n] > arr[n-1]) return n;
        int low = 1;
        int high = arr.length - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return mid;
            if (arr[mid] > arr[mid-1]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}