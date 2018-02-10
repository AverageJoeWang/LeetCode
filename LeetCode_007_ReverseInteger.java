/**
 * Created by oliverwang on 2018/2/10.
 */


public class LeetCode_007_ReverseInteger {
    public int reverse(int x) {
        int res = 0, abs = 1, n = x;
        if (n < 0){
            abs = -1;
            n = Math.abs(n);
        }
        while (n != 0){
            int temp = n%10;
            if (res > Integer.MAX_VALUE/10 || res < Integer.MIN_VALUE/10){
                return 0;
            }
            res = res * 10 + temp;
            n /= 10;
        }
        return res * abs;
    }
}
