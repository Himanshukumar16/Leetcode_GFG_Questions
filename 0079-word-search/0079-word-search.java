class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean ans = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean isThere = searchWord(board, word, 0, i, j);
                    ans = ans || isThere;
                }
            }
        }
        return ans;
    }
    boolean searchWord(char[][] mat, String word, int index, int rowIndex, int columnIndex) {

        // base cases
        if (index >= word.length()) return true;
        if (rowIndex < 0 || columnIndex < 0 || rowIndex > mat.length - 1 || columnIndex > mat[0].length - 1 || mat[rowIndex][columnIndex] != word.charAt(index)) return false;

        // changing value to other to avoid duplicates
        char temp = mat[rowIndex][columnIndex];
        mat[rowIndex][columnIndex] = '@';

        // search right
        boolean b1 = searchWord(mat, word, index + 1, rowIndex, columnIndex + 1);
        // search left
        boolean b2 = searchWord(mat, word, index + 1, rowIndex, columnIndex - 1);
        // search up
        boolean b3 = searchWord(mat, word, index + 1, rowIndex - 1, columnIndex);
        // search bottom
        boolean b4 = searchWord(mat, word, index + 1, rowIndex + 1, columnIndex);

        // reassignning value
        mat[rowIndex][columnIndex] = temp;
        return b1 || b2 || b3 || b4;
    }
}