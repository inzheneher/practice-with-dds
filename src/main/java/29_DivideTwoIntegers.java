class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int c = 0;
        int sum = 0;
        int dividendAbs = Math.abs(dividend);
        int divisorAbs = Math.abs(divisor);
        if (divisorAbs > dividendAbs) {
            return 0;
        }

        for (int i = 0; i < dividendAbs; i++) {
            if (sum == dividendAbs) {
                break;
            } else if (sum > dividendAbs) {
                c -= 1;
                break;
            }
            sum += divisorAbs;
            c++;
        }
        if (dividend < 0) {
            if (divisor > 0) {
                return -c;
            } else {
                return c;
            }
        } else {
            if (divisor > 0) {
                return c;
            } else {
                return -c;
            }
        }
    }
}
