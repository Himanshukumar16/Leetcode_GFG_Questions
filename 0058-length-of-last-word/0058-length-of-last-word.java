class Solution {
    public int lengthOfLastWord(String s) {
        s = s.strip();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') cnt = 0;
            else cnt++;
        } 
        return cnt;
    }
}