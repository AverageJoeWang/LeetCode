/**
 * Created by wanglifei on 2018/1/10.
 */
public class LeetCode_058_LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String [] str = s.split("\\s+");
        if (str.length == 0)return 0;
        else return str[str.length - 1].length();
    }
}
