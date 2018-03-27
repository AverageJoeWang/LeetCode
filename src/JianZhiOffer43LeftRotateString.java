/**
 * Created by oliverwang on 2018/3/27.
 */


public class JianZhiOffer43LeftRotateString {
    public String LeftRotateString(String str,int n) {
        StringBuilder s = new StringBuilder();
        if (str == null || str.length() == 0) return s.toString();
        for (int i = n%str.length() - 1;  i < str.length(); i++){
            s.append(str.charAt(i));
        }
        for (int i = 0; i < n%str.length(); i++){
            s.append(str.charAt(i));
        }
        return s.toString();
    }
}
