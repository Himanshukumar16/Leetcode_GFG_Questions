class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] boolArr = new boolean[nums.length];
        getPermutation(nums, result, new ArrayList<>(), boolArr);
        return (result);
    }

    public static void getPermutation(int[] arr, List<List<Integer>> result, List<Integer> temp, boolean[] bool) {
        if (temp.size() == arr.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!bool[i]) {
                bool[i] = true;
                temp.add(arr[i]);
                getPermutation(arr, result, temp, bool);
                temp.removeLast();
                bool[i] = false;
            }
        }
    }
}