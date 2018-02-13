/**
 * Created by oliverwang on 2018/2/13.
 */


public class LeetCode_172_FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int res = 0;
        long temp = n;
        for (long i = 5; i <= temp; i *= 5){
            res += n / i;
        }
        return res;
    }
}
