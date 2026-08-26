class Solution {
    public int median(int[][] matrix) {
        // code here
        int[] arr = new int[matrix.length * matrix[0].length];
        int i = 0;
        for (int[] row : matrix) {
            for (int ele : row) {
                arr[i] = ele;
                i++;
            }
        }
        Arrays.sort(arr);
        return arr[(arr.length - 1) / 2];
    }
}