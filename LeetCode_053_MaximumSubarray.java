/**
 * Created by wanglifei on 2017/12/30.
 */
public class LeetCode_053_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++)
        {
            sum = Math.max(nums[i], sum + nums[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
