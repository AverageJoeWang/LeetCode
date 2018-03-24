/**
 * Created by oliverwang on 2018/3/24.
 */


public class JianZhiOffer36FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int aLen = getLength(pHead1);
        int bLen = getLength(pHead2);
        if(aLen > bLen){
            int k = aLen - bLen;
            while(k -- != 0)
                pHead1 = pHead1.next;
        }else if(aLen < bLen){
            int k = bLen - aLen;
            while(k -- != 0)
                pHead2 = pHead2.next;
        }
        while(pHead1 != null){
            if(pHead1 == pHead2)
                return pHead1;
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
    }
    public int getLength(ListNode node){
        int n = 0;
        while(node != null){
            n++;
            node = node.next;
        }
        return n;
    }
}
