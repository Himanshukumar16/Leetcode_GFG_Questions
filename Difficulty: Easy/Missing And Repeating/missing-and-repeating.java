class Solution {
	ArrayList<Integer> findTwoElement(int nums[]) {
		// code here
		ArrayList<Integer> answer = new ArrayList<>();
		int repeat = -1;
		int missing = -1;
		long n = nums.length;
		
		long sum = n * (n + 1) / 2;
		long arrSum = 0;
		long sumSquare = n * (n + 1) * (2 * n + 1) / 6;
		long arrSquareSum = 0;
		
		for (int i = 0; i < n; i++) {
			arrSum += nums[i];
			arrSquareSum += (long)nums[i] * (long)nums[i];
		}
		
		long diffSum = arrSum - sum;
		long diffSqSum = arrSquareSum - sumSquare;
		
		long xplusy = diffSqSum / diffSum;
		
		repeat = (int) (xplusy + diffSum) / 2;
		missing = (int) xplusy - repeat;
		
		answer.add(repeat);
		answer.add(missing);
		return answer;
	}
}
