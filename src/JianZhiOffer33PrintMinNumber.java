import java.util.ArrayList;

/**
 * Created by oliverwang on 2018/3/22.
 */


public class JianZhiOffer33PrintMinNumber {
    public String PrintMinNumber(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int anArr : numbers)
            list.add(anArr);
        list.sort((o1, o2) -> {//lambda表达式
            String s1 = o1 + "" + o2;
            String s2 = o2 + "" + o1;
            return s1.compareTo(s2);
        });
        for (Integer aList : list) {
            stringBuilder.append(String.valueOf(aList));
        }
        return stringBuilder.toString();
    }
}
