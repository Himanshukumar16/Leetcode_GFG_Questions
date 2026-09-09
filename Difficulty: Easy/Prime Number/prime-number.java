class Solution {
	static boolean isPrime(int num) {
		// code here
		if (num == 1) return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
		    if (num % i == 0) return false;
		}
		return true;
	}
}