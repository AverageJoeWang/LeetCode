import java.util.Arrays;

/**
 * Created by oliverwang on 2018/2/27.
 */


public class LeetCode_455_AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j =0;
        while (i < g.length && j < s.length){
            if (g[i] <= s[j]){
                res++;
                i++;
                j++;
            }else if (g[i] > s[j]) j++;
        }
        return res;
    }
}
