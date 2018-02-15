/**
 * Created by oliverwang on 2018/2/15.
 */

//汉明距离：考察的是与或非符号运算，^,&
public class LeetCode_461_HammingDistance {
    public int hammingDistance(int x, int y) {
        int n = x ^ y, count = 0;
        for (int i = 0; i < 32; i++){
            count += (n >> i) & 1;
        }
        return count;
    }
}
