import java.util.*;

/**
 * Created by oliverwang on 2018/3/7.
 */

public class JianzhiOffer_tree_MidNumber {
    ArrayList<Integer> al = new ArrayList<Integer>();
    public void Insert(Integer num) {
        al.add(num);
        Collections.sort(al);
    }

    public Double GetMedian() {
        int mid = al.size() / 2;
        if ((al.size() & 1) == 0) {
            Integer n1 = al.get(mid);
            Integer n2 = al.get(mid - 1);
            double s = (Double.valueOf(n1 + "") + Double.valueOf(n2 + "")) / 2;
            return s;
        } else {
            double s = Double.valueOf(al.get(mid) + "");
            return s;
        }
    }
}
