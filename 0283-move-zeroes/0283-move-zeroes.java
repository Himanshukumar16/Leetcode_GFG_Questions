class Solution {
    public int[] moveZeroes(int[] arr) {
        int j = '*';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j != '*') {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }
        return arr;
    }
}