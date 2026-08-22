class Solution {
    public boolean checkDivisibility(int n) {
        long prod = 1;
        long sum = 0;
        int dup = n;
        while (dup != 0) {
            int last = dup % 10;
            prod *= last;
            sum += last;
            dup = dup / 10;
        }
        if (n % (prod + sum) == 0) return true;
        return false;
    }
}