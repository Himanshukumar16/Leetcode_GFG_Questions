class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat[0].length;
        int low = 0;
        int high = mat[0].length - 1;
        while (low <= high) {
            int mid = low + (high - low);
            int row = maxElementRow(mat,mid);
            int left = (mid - 1 >= 0) ? mat[row][mid - 1] : -1;
            int right = (mid + 1 < m) ? mat[row][mid + 1] : -1;
            if (mat[row][mid] > left && mat[row][mid] > right) {
                return new int[]{row,mid};
            } 
            if (mat[row][mid] > left) low = mid + 1;
            else high = mid - 1;
        }
        return new int[]{-1,-1};
    }
    int maxElementRow(int[][] mat,int mid) {
        int maxRow = -1;
        int maxElement = -1;
        for (int i = 0; i < mat.length; i++) {
            if (maxElement < mat[i][mid]) {
                maxRow = i;
                maxElement = mat[i][mid];
            }
        }
        return maxRow;
    }
}