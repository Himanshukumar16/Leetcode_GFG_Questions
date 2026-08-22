class Solution {
	public double minMaxDist(int[] arr, int k) {
		// code here
		int n = arr.length;
		double low = 0;
		double high = 0;
		for (int i = 0; i < n - 1 ; i++) {
			high = Math.max(arr[i + 1]-arr[i], high);
		}
		double diff = 1e-6;
		while (high - low > diff) {
			double mid = (low + high) / 2;
			double cnt = numberOfGasPlaced(mid, arr);
			if (cnt > k)
				low = mid;
			else
				high = mid;
		}
		return high;
	}
	double numberOfGasPlaced(double mid, int[] arr) {
		double placed = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int gasBetween = (int)((arr[i + 1] - arr[i]) / mid);
			if ((arr[i + 1] - arr[i]) / mid == gasBetween * mid) {
				gasBetween--;
			}
			placed += gasBetween;
		}
		return placed;
	}
}
