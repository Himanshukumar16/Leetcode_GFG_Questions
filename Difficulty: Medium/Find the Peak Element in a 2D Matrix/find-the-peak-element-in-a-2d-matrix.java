class Solution {
	public ArrayList<Integer> findPeakGrid(int[][] mat) {
		// code here
		ArrayList<Integer> al = new ArrayList<>();
		int m = mat[0].length;
		int low = 0;
		int high = mat[0].length - 1;
		while (low <= high) {
			int mid = low + (high - low)/2;
			int row = maxElementRow(mat, mid);
			int left = (mid - 1 >= 0) ? mat[row][mid - 1] : Integer.MIN_VALUE;
			int right = (mid + 1 < m) ? mat[row][mid + 1] : Integer.MIN_VALUE;
			if ((mat[row][mid] >= left) && (mat[row][mid] >= right)) {
				al.add(row);
				al.add(mid);
				return al;
			}
			if (mat[row][mid] < right)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return al;
	}
	int maxElementRow(int[][] mat, int mid) {
		int maxRow = -1;
		int maxElement = Integer.MIN_VALUE;
		for (int i = 0; i < mat.length; i++) {
			if (maxElement <= mat[i][mid]) {
				maxRow = i;
				maxElement = mat[i][mid];
			}
		}
		return maxRow;
	}
}