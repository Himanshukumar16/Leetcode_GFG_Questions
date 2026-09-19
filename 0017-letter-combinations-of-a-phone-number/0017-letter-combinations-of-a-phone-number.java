class Solution {
    public List<String> letterCombinations(String digits) {
        String[] keyPad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> lst = new ArrayList<>();
        getCombination("",keyPad,0,lst,digits);
        return lst;
    }
    void getCombination(String str, String[] keys, int index,List<String> lst, String digits) {
        if (index == digits.length()) {
            lst.add(str);
            return;
        }
        int number = digits.charAt(index) - '0';
        for (int i = 0; i < keys[number].length(); i++) {
            getCombination(str+keys[number].charAt(i),keys,index+1,lst,digits);
        }
    }
}