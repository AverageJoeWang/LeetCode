/**
 * Created by oliverwang on 2018/2/12.
 */


public class LeetCode_367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        return (int)Math.sqrt(num) * (int)Math.sqrt(num) == num;
    }
}
