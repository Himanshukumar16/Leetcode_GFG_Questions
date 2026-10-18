class Solution {
    public int minDeletions(int[] nums) {
        // int i = 0;
        // int j = 1;
        // int count = 0;

        // while(j<nums.length){
        //     while(j<nums.length && nums[i]==nums[j]){
        //         j++;
        //         count++;
        //     }
        //     i = j;
        //     j++;
        // }
        // return count;

        int cnt = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i+1]) cnt++;
        }
        return cnt;
    }
}