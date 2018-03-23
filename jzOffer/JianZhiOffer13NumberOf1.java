/**
 * Created by oliverwang on 2018/3/12.
 */


public class JianZhiOffer13NumberOf1 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0){
            ++count;
            n = (n-1) & n;
        }
        return count;
    }
}
