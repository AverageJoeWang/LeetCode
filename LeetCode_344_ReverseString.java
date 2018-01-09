/**
 * Created by wanglifei on 2018/1/9.
 */
public class LeetCode_344_ReverseString {
    public String reverseString(String s) {
//        return new StringBuilder(s).reverse().toString();
        StringBuilder strb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0)
            strb.append(s.charAt(i--));
        return strb.toString();
    }
}
