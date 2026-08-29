class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(str);
        return checkPalindrome(str, 0);
    }
    boolean checkPalindrome(String s, int len) {
        if (len == s.length() / 2) return true;
        if (s.charAt(len) != s.charAt(s.length()-1 - len)) return false;
        return checkPalindrome(s, len + 1);
    }
}