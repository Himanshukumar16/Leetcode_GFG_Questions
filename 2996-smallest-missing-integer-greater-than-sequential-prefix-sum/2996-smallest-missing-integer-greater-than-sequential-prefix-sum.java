class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : nums) al.add(i);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]+1) {
                sum += nums[i];
                maxSum = Math.max(sum, maxSum);
            } else break;
        }
        System.out.println(maxSum);
        while (al.contains(maxSum)) {
            maxSum++;
        }
        return maxSum;
    }
}