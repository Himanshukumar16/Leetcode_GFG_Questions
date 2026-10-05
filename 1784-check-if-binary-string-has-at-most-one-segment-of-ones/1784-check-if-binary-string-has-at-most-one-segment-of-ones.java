class Solution {
    public boolean checkOnesSegment(String s) {
        int cnt = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1' && cnt == 0) return false;
            if (s.charAt(i) == '0') cnt = 0;
        }
        return true;
    }
}