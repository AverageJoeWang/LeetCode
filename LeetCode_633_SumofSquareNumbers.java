/**
 * Created by oliverwang on 2018/2/8.
 */


public class LeetCode_633_SumofSquareNumbers {
    public boolean judgeSquareSum(int c) {
        for (int i = (int)Math.sqrt(c); i*i >= c/2; i--)
        {
            if (i*i == c)
                return true;
            int s = c - i*i;
            int j = (int)Math.sqrt(s);
            if (j*j == s)
                return true;
        }
        return false;
    }
}
