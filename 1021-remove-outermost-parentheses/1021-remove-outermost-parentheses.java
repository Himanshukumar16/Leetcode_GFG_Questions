class Solution {
    public String removeOuterParentheses(String s) {
        int cnt = 0;
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
                if (cnt > 1) str.append((s.charAt(i)));
            }
            else {
                if (cnt > 1) str.append((s.charAt(i)));
                cnt--;
            }
        }
        return str.toString();
    }
}