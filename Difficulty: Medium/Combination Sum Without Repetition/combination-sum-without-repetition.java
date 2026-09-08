class Solution {
	public ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
		// code here
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> olist = new ArrayList<>();
		ArrayList<Integer> lst = new ArrayList<>();
		generated(olist, lst, 0, target, arr);
		return olist;
	}
	void generated(ArrayList<ArrayList<Integer>> olist, ArrayList<Integer> lst, int index, int target, int[] arr) {
		if (target < 0)
			return;
		if (index == arr.length) {
			Collections.sort(lst);
			if (target == 0 && !olist.contains(lst)) {
				olist.add(new ArrayList<>(lst));
			}
			return;
		}
		if (arr[index] <= target) {
			lst.add(arr[index]);
			generated(olist, lst, index + 1, target - arr[index], arr);
			lst.remove(lst.size() - 1);
		}
		generated(olist, lst, index + 1, target, arr);
	}
}
