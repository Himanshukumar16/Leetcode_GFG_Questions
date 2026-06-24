class Solution {
    public int removeDuplicates(int[] arr) {
        int j = 1;
        int i = 0;
        if (arr.length == 1) return 1;
        while (i < j && j < arr.length) {
            if (arr[i] != arr[j]) {
                arr[i+1] = arr[j];
                i++;
            }
            j++;
        }
        return i+1;
    }
}