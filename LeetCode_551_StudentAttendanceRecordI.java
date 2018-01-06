/**
 * Created by wanglifei on 2018/1/6.
 */
public class LeetCode_551_StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int a = 0, l = 0, count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'A') a++;
            else if (s.charAt(i) == 'L') {
                if (i > 0 && s.charAt(i - 1) == 'L'){
                    l++;
                    count = Math.max(l, count);
                }else{
                    l=1;
                    count = Math.max(l, count);
                }
            }
            if (count > 2 || a > 1) return false;
        }
        return true;
    }
}
