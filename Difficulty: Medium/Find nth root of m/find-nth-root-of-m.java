class Solution {
    public int nthRoot(int N, int M) {
        // code here
        if (M == 0) return 0;
        int low = 1;
        int high = M;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int number = prod(N,mid, M);
            if (number == 0) return mid;
            else if (number == 1) high = mid - 1;
            else low = mid + 1;
        }
        return ans;
    }
    public int prod(int loopEnd, int ele, int M) {
        double product = 1;
        for (int i = 1; i <= loopEnd; i++) {
            product *= ele;
            if (product > M) return 1;
        }
        if (product == M) return 0;
        return -1;
    }
}