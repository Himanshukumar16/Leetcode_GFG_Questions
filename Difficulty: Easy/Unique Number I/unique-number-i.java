class Solution {
    public int findUnique(int[] arr) {
        // code here
        int xor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor ^= arr[i];
        }
        return xor;
    }
}