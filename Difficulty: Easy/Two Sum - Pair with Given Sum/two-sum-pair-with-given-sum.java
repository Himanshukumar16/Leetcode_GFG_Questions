class Solution {
    boolean twoSum(int nums[], int target) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        // int[] ansArr = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            else {
                map.put(target-nums[i],i);
            }
        }
        return false;
    }
}