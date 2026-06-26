class Solution {
    public int missingNumber(int[] arr) {
        // int n = arr.length;
        // int reqSum = n*(n+1) / 2;
        // int actualSum = 0;
        // for (int i : arr) {
        //     actualSum += i;
        // }
        // return reqSum - actualSum;

        int xor1 = 0;
        int xor2 = 0;
        for (int i : arr) {
            xor1 = xor1 ^ i;
        }
        for (int i = 0; i <= arr.length; i++) {
            xor2 = xor2 ^ i;
        }
        return xor1 ^ xor2;
    }
}