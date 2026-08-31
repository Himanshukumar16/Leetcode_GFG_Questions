class Solution {
    public int addDigits(int num) {
        long sum = 0;
        while (num > 0) {
            sum = 0;
            while (num != 0) {
                int last = num % 10;
                sum += last;
                num = num / 10;
            }
            if (sum >= 10) num = (int)sum;
        }
        return (int)sum;
    }
}