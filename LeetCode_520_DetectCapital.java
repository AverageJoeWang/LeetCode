/**
 * Created by wanglifei on 2018/1/7.
 */
public class LeetCode_520_DetectCapital {
    public boolean detectCapitalUse(String word) {
        int n = 0;
        for (int  i = 0; i < word.length(); i++)
            if (Character.isUpperCase(word.charAt(i))) n++;
        return n == 0 || word.length() == n || (n == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
