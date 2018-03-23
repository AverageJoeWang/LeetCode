/**
 * Created by oliverwang on 2018/3/11.
 */


public class JianZhiOffer2replaceSpace {
    public String replaceSpace(StringBuffer str) {
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ') str.replace(i, i+1, "%20");
        return str.toString();
    }
}
