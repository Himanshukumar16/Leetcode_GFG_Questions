class Solution {
    public int singleNumber(int[] arr) {
        // brute -> nested loop
        // better -> map
        // optimal -> xor

        int xor = 0;
        for (int i : arr) {
            xor = xor ^ i;
        }
        return xor;
    }
}