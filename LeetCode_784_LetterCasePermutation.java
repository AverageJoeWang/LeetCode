import java.util.ArrayList;
import java.util.List;

/**
 * Created by oliverwang on 2018/2/20.
 */


public class LeetCode_784_LetterCasePermutation {
    List<String> list;
    public List<String> letterCasePermutation(String S) {
        list = new ArrayList<>();
        backtrack(S.toCharArray(), 0, "");
        return list;
    }

    public void backtrack(char[] cs, int pos, String ans) {
        if (pos == cs.length) {
            list.add(ans);
            return;
        }
        else {
            if (Character.isAlphabetic(cs[pos])) {
                char l = cs[pos];
                backtrack(cs, pos + 1, ans + l);
                if (l >= 'a' && l <= 'z') l = (char) (l - 'a' + 'A');
                else if (l >= 'A' && l <= 'Z') l = (char) (l - 'A' + 'a');
                backtrack(cs, pos + 1, ans + l);
            }
            else {
                backtrack(cs, pos + 1, ans + cs[pos]);
            }
        }
    }
}
