class Solution {
	static boolean armstrongNumber(int n) {
		// code here
		
		int dup = n;
		int cnt = 0;
		while (dup != 0) {
			dup = dup / 10;
			cnt++;
		}
		int sum = 0;
		dup = n;
		while (dup != 0) {
			int last = dup % 10;
			sum += (int)Math.pow(last, cnt);
			dup = dup/10;
		}
		return sum == n;
	}
}
