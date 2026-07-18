class Solution {
    public String rearrangeString(String s, char x, char y) {
        String str = "";
        int j = 0;
        while (j < s.length()) {
            if (s.charAt(j) == y) {
                str += s.charAt(j);
            }
            j++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == x || s.charAt(i) == y) continue;
            else str += s.charAt(i);
        }
        j = 0;
        while (j < s.length()) {
            if (s.charAt(j) == x) {
                str += s.charAt(j);
            }
            j++;
        }
        return str;
    }
}