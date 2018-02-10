/**
 * Created by oliverwang on 2018/2/10.
 */


public class LeetCode_231_PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        if(n>=2 && n%2==0)
            return isPowerOfTwo(n/2);
        return false;
    }
}
