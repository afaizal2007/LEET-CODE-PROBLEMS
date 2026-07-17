class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        int absDividend = dividend < 0 ? dividend : -dividend;
        int absDivisor = divisor < 0 ? divisor : -divisor;
        int quotient = 0;
        while (absDividend <= absDivisor) {
            int tempDivisor = absDivisor;
            int multiple = 1;
            while (tempDivisor >= Integer.MIN_VALUE >> 1 && absDividend <= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }
            absDividend -= tempDivisor;
            quotient += multiple;
        }
        return isNegative ? -quotient : quotient;
    }
}
