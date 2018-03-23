
/**
 * Created by oliverwang on 2018/3/23.
 */


public class JianZhiOffer35FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        int [] a  = new int['z' + 1];
        for (int i = 0; i < str.length(); i++){
            a[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++){
            if (a[str.charAt(i)] == 1)
                return i;
        }
        return -1;
    }
}
