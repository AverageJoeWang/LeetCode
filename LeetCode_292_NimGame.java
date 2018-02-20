/**
 * Created by oliverwang on 2018/2/20.
 */

/*博弈论问题
1 true
2 true
3 true
4 false
5 true
6 true
7 true
8 false
9 true
* */
public class LeetCode_292_NimGame {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
