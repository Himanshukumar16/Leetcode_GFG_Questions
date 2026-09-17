class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int index = (int)(n / 4);
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[i+index]) return arr[i];
        }
        return -1;
    }
}