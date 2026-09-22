class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> lst = new ArrayList<>();
        pallindromePartition(s, 0, ans, lst);
        return ans;
    }

    void pallindromePartition(String s, int index, List<List<String>> ans, List<String> str) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(str));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                str.add(s.substring(index, i+1));
                pallindromePartition(s,i+1,ans,str);
                str.remove(str.size()-1);
            }
        }
    }
    boolean isPalindrome(String s,int index,int i) {
        while (index <= i) {
            if (s.charAt(index) != s.charAt(i)) return false;
            index++;
            i--;
        }
        return true;
    }
}