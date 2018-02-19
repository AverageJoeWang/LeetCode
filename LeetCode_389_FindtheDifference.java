/**
 * Created by oliverwang on 2018/2/19.
 */


public class LeetCode_389_FindtheDifference {
    public char findTheDifference(String s, String t) {
        s += t;
        int ch = 0;
        for (int i = 0; i < s.length(); i++)
            ch ^= s.charAt(i);
        return (char) ch;
    }
}
