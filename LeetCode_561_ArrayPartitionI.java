import java.util.Arrays;

/**
 * Created by wanglifei on 2017/12/28.
 */
public class LeetCode_561_ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2)
            sum += Math.min(nums[i], nums[i + 1]);
        return sum;
    }
}
