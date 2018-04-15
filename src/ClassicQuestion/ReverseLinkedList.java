package ClassicQuestion;

/**
 * Created by oliverwang on 2018/4/14.
 */

//class ListNode {
//    int val;
//    ListNode next = null;
//    ListNode(int val) {
//        this.val = val;
//    }
//}

public class ReverseLinkedList {
    public static ListNode ReverseLinkedListed(ListNode head){
        ListNode p = null, next = null;
        while (head != null){
            next = head.next;
            head.next = p;
            p = head;
            head = next;
        }
        return p;
    }

    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ListNode p = ReverseLinkedListed(node);
        while (p != null){
            System.out.println(p.val);
            p = p.next;
        }
    }
}
