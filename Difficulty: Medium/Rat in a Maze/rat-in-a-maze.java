class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        String str = "";
        path(ans, str, maze, 0, 0);
        Collections.sort(ans);
        return ans;
    }
    void path(ArrayList<String> ans, String str, int[][] maze, int row, int col) {
        // base case
        if (row < 0 || row == maze.length || col < 0 || col == maze.length || maze[row][col] != 1) return;
        if (row == maze.length - 1 && col == maze.length - 1 && maze[row][col] == 1) {
            ans.add(str);
            return;
        }
        
        // mark point as visited
        int temp = maze[row][col];
        maze[row][col] = -1;
        
        // move up
        path(ans, str+"U", maze, row-1, col);
        // move dowm
        path(ans, str+"D", maze, row+1, col);
        // move left
        path(ans, str+"L", maze, row, col-1);
        // move right
        path(ans, str+"R", maze, row, col+1);
        
        // reassigning
        maze[row][col] = temp;
    }
}