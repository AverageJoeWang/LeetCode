/**
 * Created by oliverwang on 2018/2/5.
 */


public class LeetCode_160_IntersectionofTwoLinkedLists {

    public int getLength(ListNode node){
        int n = 0;
        while (node != null){
            n++;
            node = node.next;
        }
        return n;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLen = getLength(headA);
        int bLen = getLength(headB);
        if (aLen > bLen){
            int a = aLen - bLen;
            while (a-- != 0)
                headA = headA.next;
        }else if (aLen < bLen){
            int b = bLen - aLen;
            while (b-- != 0)
                headB = headB.next;
        }
        while (headA != null)
        {
            if (headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
