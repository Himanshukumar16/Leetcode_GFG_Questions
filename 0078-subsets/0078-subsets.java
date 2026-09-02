class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> powerSet = new ArrayList<>();
        List<Integer> generated = new ArrayList<>();
        generatePowerSet(powerSet,generated,nums,0);
        return powerSet;
    }
    void generatePowerSet(List<List<Integer>> olst, List<Integer> lst, int[] arr, int index) {
        if (index == arr.length) {
            Collections.sort(lst);
            if (!olst.contains(lst)) {
                olst.add(new ArrayList<>(lst));
            }
            return;
        }
        generatePowerSet(olst, lst, arr, index+1);
        lst.add(arr[index]);
        generatePowerSet(olst, lst, arr, index+1);
        lst.remove(lst.size()-1);
    }
}