import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wanglifei on 2017/12/27.
 */
public class LeetCode_219_ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k < 1) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], i);
            else {
                int val = map.get(nums[i]);
                if (i - val <= k)
                    return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
