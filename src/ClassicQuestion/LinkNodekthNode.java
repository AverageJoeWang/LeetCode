package ClassicQuestion;

/**
 * Created by oliverwang on 2018/4/15.
 */


public class LinkNodekthNode {
    public ListNode LinkNodekthNode(ListNode head, int k){
        if (head == null || k <= 0) return null;
        ListNode first = head;
        ListNode second = head;
        for (int i = 1; i < k; i++){
            if (first.next != null) first = first.next;
            else return null;
        }
        while (first != null){
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
