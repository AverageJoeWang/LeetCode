/**
 * Created by oliverwang on 2018/3/15.
 */


public class JianZhiOffer17Merge {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list2 == null) return list1;
        if (list1 == null) return list2;
        ListNode node = null;
        if (list1.val < list2.val){
            node = list1;
            node.next = Merge(list1.next, list2);
        }else {
            node = list2;
            node.next = Merge(list1, list2.next);
        }
        return node;
    }
}
