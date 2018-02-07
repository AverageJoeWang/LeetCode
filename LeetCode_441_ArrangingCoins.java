/**
 * Created by oliverwang on 2018/2/7.
 */


public class LeetCode_441_ArrangingCoins {
    public int arrangeCoins(int n) {
        long sum = 0;
        int i = 1;
        while (sum < n){
            sum += i;
            i++;
        }
        if (sum == n) return i - 1;
        else return i - 2;
    }
}
