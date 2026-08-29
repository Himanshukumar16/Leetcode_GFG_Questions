class Solution {
	static boolean isPrime(int num) {
		// code here
		if (num == 1)
			return false;
		return isPrime(num, 2);
	}
	static boolean isPrime(int num, int cnt) {
		if (cnt > Math.sqrt(num))
			return true;
		if (num % cnt == 0)
			return false;
		return isPrime(num, cnt + 1);
	}
}