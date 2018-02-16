import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by oliverwang on 2018/2/16.
 */


public class LeetCode_682_BaseballGame {
    public int calPoints(String[] ops) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int sum = 0;
        for (String op : ops){
            if (op.equals("C"))
                sum -= linkedList.removeLast();
            else if (op.equals("+")){
                linkedList.add(linkedList.peekLast() + linkedList.get(linkedList.size() - 2));
                sum += linkedList.peekLast();
            }else if (op.equals("D")){
                linkedList.add(linkedList.peekLast() * 2);
                sum += linkedList.peekLast();
            }else {
                linkedList.add(Integer.parseInt(op));
                sum += linkedList.peekLast();
            }
        }
        return sum;
    }
}
