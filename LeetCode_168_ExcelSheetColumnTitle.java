/**
 * Created by oliverwang on 2018/2/13.
 */


public class LeetCode_168_ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        String ret = "";
        while(n != 0)
        {
            ret = (char)((n-1)%26+'A') + ret;
            n = (n-1)/26;
        }
        return ret;
    }
}
