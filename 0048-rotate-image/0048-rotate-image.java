class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int[] arr : matrix) {
            for (int i = 0; i < arr.length/2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }

        for (int[]i : matrix) {
            for (int el : i) {
                System.out.print(el+" ");
            }
            System.out.println();
        }
    }
}