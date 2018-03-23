/**
 * Created by oliverwang on 2018/3/10.
 */

import java.util.*;

public class JianZhiOfferprintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
}
