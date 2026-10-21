class Solution {
    public int divide(int dividend, int divisor) {
        
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if (dividend == divisor) return 1;
        if(divisor == 1) return dividend;

        boolean signPositive = true;
        if ((dividend <= 0 && divisor > 0) || (dividend >= 0 && divisor < 0)) {
            signPositive = false;
        }

        long divid = Math.abs((long)dividend);
        long divis = Math.abs((long)divisor); 
        int dividedTill = 0;
        
        while (divid >= divis) {
            int power = 0;
            while (divid >= (divis << (power+1))) {
                power+=1;
            }
            dividedTill += (1 << power);
            divid -= (divis << power);
        }

        if (dividedTill == (1 << 31) && signPositive) {
            return Integer.MAX_VALUE; 
        }

        if (dividedTill == (1 << 31) && !signPositive) {
            return Integer.MIN_VALUE;
        }

        return (signPositive) ? dividedTill : -dividedTill;
    }
}