class Solution {
    public int missingMultiple(int[] nums, int k) {

        // if (nums.length == 1 && nums[0] == k) return k + nums[0];
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int i = 0; i < k * nums.length + 2; i++) {
            if (!set.contains(k * (i+1))) return k * (i+1);
        }
        return -1;
    }
}