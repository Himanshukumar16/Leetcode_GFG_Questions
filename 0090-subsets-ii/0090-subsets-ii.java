class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        subset(nums, 0, new ArrayList<Integer>(), answer);
        // System.out.println(answer);
        return answer;
    }

    public void subset(int[] arr, int index, ArrayList<Integer> lst, List<List<Integer>> result) {
        if (index == arr.length) {
            // Collections.sort(lst);
            if (!result.contains(lst)) {
                // System.out.println(lst);
                result.add(new ArrayList<>(lst));
            }
            return;
        }
        lst.add(arr[index]);
        // System.out.println(lst);
        subset(arr,index+1,lst,result);
        lst.removeLast();
        // System.out.println(lst);
        subset(arr,index+1,lst,result);
    }
}