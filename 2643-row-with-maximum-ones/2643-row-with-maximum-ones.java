class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOneCount = -1;
        int maxOneRow = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            int oneCount = 0;
            for (int j = 0; j < mat[i].length; j++) {
                oneCount += mat[i][j];
            }
            if (oneCount > maxOneCount) {
                maxOneRow = i;
                maxOneCount = oneCount;
            }
        }
        return new int[]{maxOneRow,maxOneCount};
    }
}