class Solution {
	public ArrayList<String> possibleWords(int[] digits) {
		// code here
		String[] keyPad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ArrayList<String> lst = new ArrayList<>();
		getCombination("", keyPad, 0, lst, digits);
		return lst;
	}
	void getCombination(String str, String[] keys, int index, ArrayList<String> lst, int[] digits) {
		if (index == digits.length) {
			lst.add(str);
			return;
		}
		int number = digits[index];
		if (number == 1 || number == 0) {
		    getCombination(str, keys, index + 1, lst, digits);
		}
		for (int i = 0; i < keys[number].length(); i++) {
			getCombination(str + keys[number].charAt(i), keys, index + 1, lst, digits);
		}
	}
}
