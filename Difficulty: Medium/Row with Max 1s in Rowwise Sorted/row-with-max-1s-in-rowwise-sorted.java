class Solution {
    public int rowWithMax1s(int[][] mat) {
        // code here
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
        if (maxOneCount == 0) return -1;
        return (maxOneRow );
    }
}