// class Solution {
//     public int divide(int dividend, int divisor) {
//         if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
//         // if(dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;

//         boolean negative = (dividend < 0) ^ (divisor < 0);

//         long absDividend = Math.abs((long) dividend);
//         long absDivisor = Math.abs((long) divisor);

//         int quotient = 0;

//         while(absDividend >= absDivisor){
//             long tempDivisor = absDivisor, multiple = 1;
//             while (absDividend >= (tempDivisor << 1)) {
//                 tempDivisor <<= 1;
//                 multiple <<= 1;
//             }
//             absDividend -= tempDivisor;
//             quotient += multiple;
//         }
//         return negative ? -quotient : quotient;
//     }
// }

class Solution {
    public int divide(int dividend, int divisor) {
        int res = dividend/divisor;
        if(divisor==0){
            return 0;
        }
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            res = Integer.MAX_VALUE;
        }
        return res;
    }
}