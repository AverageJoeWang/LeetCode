/**
 * Created by oliverwang on 2018/2/11.
 */


public class LeetCode_400_NthDigit {
    public int findNthDigit(int n) {
        // initial vars
        long len = 1;
        long range = 9;
        long start = 1;
        while(n > (len * range)) // find n is in which range
        {
            n = n - (int)len * (int)range;  // minus the current total range digits
            // move to next range
            len++;
            range *= 10;
            start *= 10;
        }
        // now is in the correct range
        start = start + (n-1) / len;    // find the number
        String num = "" + start;
        int d = num.charAt( (n-1) % (int)len ) - '0';

        return d;
    }
}
