/**
 * Created by wanglifei on 2018/1/8.
 */
public class LeetCode_434_NumberofSegmentsinaString {
    public int countSegments(String s) {
        String res = s.trim();
        if (res.length() == 0)
            return 0;
        else return res.split("\\s+").length;
    }
}