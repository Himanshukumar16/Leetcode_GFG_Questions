class Solution {
	public ArrayList<String> generateParentheses(int n) {
		// code here
		ArrayList<String> solution = new ArrayList<>();
		String s = "(";
		findBracket(solution, n, 1, 0, s);
		return solution;
	}
	void findBracket(ArrayList<String> lst, int n, int start, int close, String s) {
		if (start == close && start + close == n) {
			lst.add(s);
			return;
		}
		if (start > n/2 || close > n/2)
			return;
		if (start < n) findBracket(lst, n, start + 1, close, s + "(");
		if (start > close) {
			findBracket(lst, n, start, close + 1, s + ")");
		}
	}
}
