import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

/**
 * Created by wanglifei on 2017/12/30.
 */
public class LeetCode_169_MajorityElement {
    public int majorityElement(int[] nums) {
        int majorityElement = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums)
        {
            if (map.containsKey(x))
            {
                int value = map.get(x) + 1;
                map.put(x, value);
            }else map.put(x, 1);
        }
        Set<Integer> ks = map.keySet();
        Iterator<Integer> it = ks.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            int value = map.get(key);
            if (value*2 >= nums.length)
            {
                majorityElement = key;
                break;
            }
        }
        return majorityElement;
    }
}
