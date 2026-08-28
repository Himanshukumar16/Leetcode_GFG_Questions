class Solution {
    public int[] runningSum(int[] nums) {
        int[] sumArr = new int[nums.length];
        int sum = 0;
        int ind = 0;
        for (int i : nums) {
            sum += i;
            sumArr[ind] = sum;
            ind++;
        }
        return sumArr;
    }
}