import java.util.Arrays;

/**
 * Created by wanglifei on 2017/12/27.
 */
public class LeetCode_217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 1) return false;
        boolean res = false;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == nums[i - 1])
            {
                res = true;
                break;
            }
        }
        return res;
    }
}
