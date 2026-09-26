class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int cnt = 0;

        if (source[0] == target[0] && source[1] == target[1]) return 0;
        if (source[0] == target[0]) return 1;
        else if (source[1] == target[1]) return 1;
        else if (Math.abs(source[0] - target[0]) == Math.abs(source[1] - target[1])) return 1;
        else return 2;
        
    }
}