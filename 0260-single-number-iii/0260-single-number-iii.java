class Solution {
    public int[] singleNumber(int[] nums) {
        int b1 = 0;
        int b2 = 0;
        int xor = 0;

        for (int i : nums) {
            xor ^= i;
        }

        int rightDiffBit = (xor & (xor - 1)) ^ xor;

        for (int i : nums) {

            if ((rightDiffBit & i)  == 0) b2 ^= i;
            else b1 ^= i;
        }

        return (b1 < b2) ? new int[]{b1,b2} : new int[]{b2,b1};
    }
}