class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> solution = new ArrayList<>();
        String s = "(";
        findBracket(solution, n, 1, 0, s);
        return solution;
    }
    void findBracket(List<String> lst,int n,int start, int close, String s) {
        if (start == close && start + close == 2 * n) {
            lst.add(s);
            return;
        }
        if (start > n || close > n) return;
        findBracket(lst, n, start + 1, close, s+"(");
        if (start > close) {
            findBracket(lst, n, start, close + 1, s+")");
        }
    }
}