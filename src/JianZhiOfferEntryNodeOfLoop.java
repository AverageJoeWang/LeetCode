import java.util.HashSet;
import java.util.Set;

/**
 * Created by oliverwang on 2018/3/10.
 */


public class JianZhiOfferEntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        Set<ListNode> set = new HashSet<>();
        while (pHead != null && set.add(pHead)){
            pHead = pHead.next;
        }
        return pHead;
    }
}
