/**
 * Created by oliverwang on 2018/3/2.
 */


public class LeetCode_693_BinaryNumberwithAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int d = n & 1;
        while ((n & 1) == d){
            d ^= 1;
            n >>= 1;
        }
        return n == 0;
    }
}
