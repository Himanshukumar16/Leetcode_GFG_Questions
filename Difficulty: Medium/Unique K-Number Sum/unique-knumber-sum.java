class Solution {
	public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
		// code here
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		combination(n, new ArrayList<>(), ans, k, 1);
		return ans;
	}
	void combination(int sum, ArrayList<Integer> lst, ArrayList<ArrayList<Integer>> ans, int k, int el) {
		if (sum < 0 || lst.size() > k)
			return;
		if (sum == 0) {
			Collections.sort(lst);
			if (!ans.contains(lst) && lst.size() == k) {
				ans.add(new ArrayList<>(lst));
			}
			return;
		}
		for (int i = el; i <= 9; i++) {
			if (i <= sum) {
				lst.add(i);
				combination(sum - i, lst, ans, k, i + 1);
				lst.remove(lst.size() - 1);
			}
		}
	}
}
