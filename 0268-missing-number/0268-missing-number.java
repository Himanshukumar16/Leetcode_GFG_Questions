class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int reqSum = n*(n+1) / 2;
        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }
        return reqSum - actualSum;
    }
}