/**
 * Created by wanglifei on 2018/1/7.
 */
public class LeetCode_521_LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        int lenA = a.length(), lenB = b.length();
        if (a.equals(b) ) return -1;
        else return Math.max(lenA, lenB);
    }
}
