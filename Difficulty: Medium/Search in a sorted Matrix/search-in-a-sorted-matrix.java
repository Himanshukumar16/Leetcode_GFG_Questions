class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int low = 0;
        int high = n * m - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;
            if (mat[row][col] == x) return true;
            if (mat[row][col] > x) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
}
