class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        getSubset(new ArrayList<>(),ans,nums,0);
        return ans;
    }
    private void getSubset(List<Integer> lst, List<List<Integer>> ans, int[] arr, int index) {
        if (index == arr.length) {
            if (!ans.contains(lst)) {
                ans.add(new ArrayList<>(lst));
            }
            return;
        }
        lst.add(arr[index]);
        getSubset(lst,ans,arr,index+1);
        lst.remove(lst.size()-1);
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                getSubset(lst, ans, arr, i);
                return;
            }
        }
        getSubset(lst, ans, arr, arr.length);
    }
}