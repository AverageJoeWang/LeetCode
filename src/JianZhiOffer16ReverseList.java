/**
 * Created by oliverwang on 2018/3/14.
 */


public class JianZhiOffer16ReverseList {
    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        ListNode reverseNode = null;
        ListNode currentNode = null;
        while (head != null){
            currentNode = head.next;
            head.next = reverseNode;
            reverseNode = head;
            head = currentNode;
        }
        return reverseNode;
    }

    public static void main(String[] args){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = null;
        JianZhiOffer16ReverseList a = new JianZhiOffer16ReverseList();
        ListNode node1 = a.ReverseList(node);
        System.out.println(node1.val + " " + node1.next.val);
    }
}
