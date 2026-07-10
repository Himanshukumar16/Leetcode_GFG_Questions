class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] ansArr = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ansArr[0] = map.get(nums[i]);
                ansArr[1] = i;
            }
            else {
                map.put(target-nums[i],i);
            }
        }
        return ansArr;
    }
}