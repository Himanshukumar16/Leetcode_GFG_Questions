class Solution {
	public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
		// code here
		ArrayList<ArrayList<Integer>> olist = new ArrayList<>();
		generated(olist, new ArrayList<>(), 0, target, arr);
		return olist;
	}
	void generated(ArrayList<ArrayList<Integer>> olist, List<Integer> lst, int index, int target, int[] arr) {
		if (index == arr.length) {
// 			System.out.print(lst);
			if (0 == target) {
				// System.out.print(lst);
				olist.add(new ArrayList<>(lst));
			}
			return;
		}
		if (arr[index] <= target) {
			lst.add(arr[index]);
			generated(olist, lst, index, target - arr[index], arr);
			lst.remove(lst.size() - 1);
		}
		generated(olist, lst, index + 1, target, arr);
	}
}