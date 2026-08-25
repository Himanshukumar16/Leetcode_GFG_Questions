class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] rows : matrix) {
            for (int ele : rows) {
                if (ele == target) return true;
            }
        }
        return false;
    }
}