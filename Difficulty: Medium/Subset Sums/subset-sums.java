class Solution {
	public ArrayList<Integer> subsetSums(int[] arr) {
		// code here
		ArrayList<Integer> lst = new ArrayList<>();
		getSum(arr, lst, 0, 0);
		return lst;
	}
	void getSum(int[] nums, ArrayList<Integer> lst, int index, int sum) {
		if (index == nums.length) {
			lst.add(sum);
			return;
		}
		getSum(nums, lst, index + 1, sum + nums[index]);
		getSum(nums, lst, index + 1, sum);
	}
}
