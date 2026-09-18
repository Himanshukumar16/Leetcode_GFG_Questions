class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        int ans = helper(n,dp);
        return ans;
    }
    int helper(int n, int[] dp) {
        if (n == 0 || n == 1) return n;

        if (dp[n] != -1) return dp[n];

        int first = helper(n-1,dp);
        int second = helper(n-2,dp);

        dp[n] = first + second;
        return dp[n];
    }
}