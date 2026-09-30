class Solution {
    public int missingInteger(int[] nums) {

        // TC -> O(n), SC -> O(n).

        int sum = nums[0];
        Set<Integer> al = new HashSet<>();

        for (int i : nums) al.add(i);

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i-1]+1) {
                sum += nums[i];
            } 
            else break;
        }

        while (al.contains(sum)) {
            sum++;
        }

        return sum;
    }
}