import java.util.Arrays;

/**
 * Created by wanglifei on 2018/1/5.
 */
public class LeetCode_014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        if (strs != null && strs.length > 0)
        {
            Arrays.sort(strs);
            for (int i = 0; i < strs[0].length(); i++)
            {
                if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i) && strs[strs.length - 1].length() > i)
                    str.append(strs[0].charAt(i));
                else break;
            }
        }
        return str.toString();
    }
}
