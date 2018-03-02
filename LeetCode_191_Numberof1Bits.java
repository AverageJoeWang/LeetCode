/**
 * Created by oliverwang on 2018/3/2.
 */


public class LeetCode_191_Numberof1Bits {
    public int hammingWeight(int n) {
        int res = 0;
        for (int i = 0; i < 32; ++i) {
            res += (n & 1);
            n = n >> 1;
        }
        return res;
    }
}
