class Solution {
    public int addDigits(int num) {
        // if (num == 0) return 0;
        // if (num % 9 == 0) return 9;
        // return num % 9;

        return sum(num);
    }

    int sum(int n) {
        if (n < 10)
            return n;
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n = n / 10;
        }
        return sum(sum);
    }
}