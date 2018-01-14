/**
 * Created by oliverwang on 2018/1/14.
 */


public class LeetCode_387_FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
        int [] a = new int[26];
        for (int i = 0; i < s.length(); i++)
            a[s.charAt(i) - 'a']++;
        for (int i = 0; i < s.length(); i++)
            if (a[s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
