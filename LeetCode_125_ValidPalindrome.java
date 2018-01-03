/**
 * Created by wanglifei on 2018/1/3.
 */
public class LeetCode_125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        else if (s.length() == 0) return true;
        String res = s.replaceAll("\\W", "").toLowerCase();
        for (int i = 0, j = res.length() - 1; i < j; ++i, --j){
            if (res.charAt(i)!=res.charAt(j))
                return false;
        }
        return true;
    }
}
