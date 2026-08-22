class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            sum += i;
            if (max < i) max = i;
        }
        if (k == 1) return sum;
        int ans = max;
        int low = max;
        int high = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int painterRequired = painterRequired(mid, arr);
            if (painterRequired <= k) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }
    int painterRequired(int noOfPainter, int[] arr) {
        int painter = 1;
        int boardPresent = 0;
        for (int i = 0; i < arr.length; i++) {
            if (boardPresent + arr[i] <= noOfPainter) {
                boardPresent += arr[i];
            }
            else {
                painter++;
                boardPresent = arr[i];
            }
        }
        return painter;
    }
}