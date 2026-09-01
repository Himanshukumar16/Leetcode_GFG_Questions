class Solution {
    public double myPow(double x, int n) {
        long num = n;
        if (x == 0) return 0;
        if (n < 0) return findPower(1/x, -num);
        return findPower(x,n);
    }
    double findPower(double x, long n) {
        double ans = 1;
        if (n == 0) return 1.0;
        if (n % 2 != 0) return x * findPower(x,n-1);
        else return findPower(x*x,n/2);
    }
}