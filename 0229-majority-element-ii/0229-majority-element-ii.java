class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cnt1 == 0 && nums[i] != ele2) {
                ele1 = nums[i];
                cnt1 = 1;
            }
            else if (cnt2 == 0 && nums[i] != ele1) {
                ele2 = nums[i];
                cnt2 = 1;
            }
            else if (nums[i] == ele1) cnt1++;
            else if (nums[i] == ele2) cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        int cntele1 = 0;
        int cntele2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele1) cntele1++;
            if (nums[i] == ele2) cntele2++;
        }
        if (cntele1 > nums.length/3) al.add(ele1);
        if (cntele2 > nums.length/3) al.add(ele2);
        return al;
    }
}