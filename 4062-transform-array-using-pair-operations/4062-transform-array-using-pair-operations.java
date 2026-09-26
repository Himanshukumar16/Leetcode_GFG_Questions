class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long sum1 = 0;
        long sum2 = 0;
        for (int i : source) sum1 += i;
        for (int i : target) sum2 += i;

        return sum1 == sum2;
    }
}