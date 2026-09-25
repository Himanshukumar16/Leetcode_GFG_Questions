class Solution {
    public void solveSudoku(char[][] board) {
        fillNumber(board);
    }

    boolean fillNumber(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    for (char n = '1'; n <= '9'; n++) {
                        if (canFill(n, board, i, j)) {
                            board[i][j] = n;
                            if (fillNumber(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean canFill(char num,char[][] board,int i,int j) {
        int startRow = (i / 3) * 3;
        int startCol = (j / 3) * 3;
        for (int col = 0; col < 9; col++) {
            if (board[i][col] == num) return false;
            if (board[col][j] == num) return false;
            if (board[startRow+(col/3)][startCol+(col%3)] == num) return false;
        }
        return true;
    }
}