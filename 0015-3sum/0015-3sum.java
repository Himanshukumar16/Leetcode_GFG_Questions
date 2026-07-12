class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> setOuter = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                List<Integer> triplets = new ArrayList<>();
                int k = - (nums[i] + nums[j]);
                if (set.contains(k)) {    
                    triplets.add(nums[i]);
                    triplets.add(k);
                    triplets.add(nums[j]);
                    Collections.sort(triplets);
                    setOuter.add(triplets);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> answerList = new ArrayList<>(setOuter);
        // System.out.println(setOuter);
        return answerList;
    }
}