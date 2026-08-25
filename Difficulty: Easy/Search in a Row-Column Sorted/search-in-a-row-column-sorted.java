class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // code here
        for (int[] rows : mat) {
            for (int ele : rows) {
                if (ele == x) return true;
            }
        }
        return false;
    }
}