class Solution {
    public int xorOperation(int n, int start) {
        int xor = 0;

        for (int i = start; i < ((2 * n) + start); i += 2) {
            xor ^= i;
        }

        return xor;
    }
}