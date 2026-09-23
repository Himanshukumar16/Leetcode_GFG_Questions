class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board.add(".".repeat(n));
        }
        queenPlaceMatrix(n,ans,0,board);
        return ans;
    }
    void queenPlaceMatrix(int n, List<List<String>> ans, int row, List<String> board) {
        if (row >= board.size()) {
            ans.add(new ArrayList<>(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isPossible(board, row, col)) {
                char[] rowArr = board.get(row).toCharArray();
                rowArr[col] = 'Q';
                board.set(row, new String(rowArr));
                
                queenPlaceMatrix(n,ans,row+1,board);

                rowArr[col] = '.';
                board.set(row, new String(rowArr));
            }
        }
    }
    boolean isPossible(List<String> board, int row, int col) {
        int r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board.get(r).charAt(c) == 'Q') return false;
            r--;
            c--;
        }
        r = row;
        c = col;
        while (r >= 0) {
            if (board.get(r).charAt(c) == 'Q') return false;
            r--;
        }
        r = row;
        while (r >= 0 && c < board.size()) {
            if (board.get(r).charAt(c) == 'Q') return false;
            r--;
            c++;
        }
        return true;
    }
}