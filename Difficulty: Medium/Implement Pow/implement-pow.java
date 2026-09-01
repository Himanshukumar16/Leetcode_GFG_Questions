class Solution {
    double power(double x, int n) {
        // code here
        if (x == 0) return 0;
            return findPower(x,n);
        }
        double findPower(double x, int n) {
            double ans = 1;
            if (n < 0) {
                x = 1/x;
                n = -n;
            }
            while (n > 0) {
                if (n%2 != 0) {
                    ans = ans * x;
                    n = n - 1;
                } else {
                    x = x * x;
                    n = n / 2;
                }
            } 
            return ans;
    }
}