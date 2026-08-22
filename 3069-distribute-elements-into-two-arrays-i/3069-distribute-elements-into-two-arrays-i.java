class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> al1 = new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();
        al1.add(nums[0]);
        al2.add(nums[1]);
        int al1Index = 0;
        int al2Index = 0;
        for (int i = 2; i < nums.length; i++) {
            if (al1.get(al1Index) > al2.get(al2Index)) {
                al1.add(nums[i]);
                al1Index++;
            }
            else {
                al2.add(nums[i]);
                al2Index++;
            }
        }
        int index = 0;
        for (int i : al1) {
            nums[index] = i;
            index++;
        }
        for (int i : al2) {
            nums[index] = i;
            index++;
        }
        return nums;
    }
}