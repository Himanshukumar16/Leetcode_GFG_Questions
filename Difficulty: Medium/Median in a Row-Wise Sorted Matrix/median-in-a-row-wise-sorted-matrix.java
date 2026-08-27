class Solution {
	public int median(int[][] matrix) {
		// code here
		int n = matrix.length;
		int m = matrix[0].length;
		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] < low)
				low = matrix[i][0];
			if (matrix[i][m - 1] > high)
				high = matrix[i][m - 1];
		}
		while (low <= high) {
			int mid = (low + high) / 2;
			int lesserNumber = lesserNumber(matrix, mid);
			if (lesserNumber <= (n * m) / 2) {
				low = mid + 1;
			} else high = mid - 1;
		}
		return low;
	}
	int lesserNumber(int[][] matrix, int mid) {
		int cnt = 0;
		for (int[] row : matrix) {
			for (int ele : row) {
				if (ele <= mid)
					cnt++;
			}
		}
		return cnt;
	}
}
