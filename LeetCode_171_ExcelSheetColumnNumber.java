/**
 * Created by oliverwang on 2018/2/13.
 */


public class LeetCode_171_ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); ++i) {
            int tmp = s.charAt(i) - 'A' + 1;
            sum = 26 * sum + tmp;
        }
        return sum;
    }
}
