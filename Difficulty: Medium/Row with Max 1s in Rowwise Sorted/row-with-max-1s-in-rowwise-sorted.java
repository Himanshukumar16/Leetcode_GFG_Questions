class Solution {
    public int rowWithMax1s(int[][] mat) {
        // code here
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < mat.length; i++) {
            int cnt = mat[0].length - binarySearch(mat[i], 1);
            if (cnt > maxCount) {
                maxCount = cnt;
                index = i;
            }
        }
        return index;
    }
    int binarySearch(int[] arr, int ele) {
        int ans = arr.length;
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (arr[mid] >= ele) {
                ans = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return ans;
    }
}