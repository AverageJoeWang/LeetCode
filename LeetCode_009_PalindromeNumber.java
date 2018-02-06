/**
 * Created by oliverwang on 2018/2/6.
 */


public class LeetCode_009_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int n = 0, temp = x;
        while (temp != 0){
            n = n * 10 + temp % 10;
            temp = temp/10;
        }
        return x == n;
    }
}
