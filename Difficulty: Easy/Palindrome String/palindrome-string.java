class Solution {
	boolean isPalindrome(String str) {
		// code here
		int n = str.length();
		for (int i = 0; i <= n/2; i++) {
			if (str.charAt(i) != str.charAt(n - i - 1)) {
			    return false;
			}
		}
		return true;
	}
}
