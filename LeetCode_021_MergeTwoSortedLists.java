/**
 * Created by oliverwang on 2018/2/4.
 */


public class LeetCode_021_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val)
        {
            ListNode temp = l1;
            temp.next = mergeTwoLists(l1.next, l2);
            return temp;
        }else {
            ListNode temp = l2;
            temp.next = mergeTwoLists(l1, l2.next);
            return temp;
        }
    }
}
