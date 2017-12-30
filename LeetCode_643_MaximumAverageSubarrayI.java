
/**
 * Created by wanglifei on 2017/12/30.
 */
public class LeetCode_643_MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0, sum = 0;
        for (int i = 0; i < k; i ++)
            sum += nums[i];
        maxSum = sum;
        for (int l = 0, r = k; r < nums.length; l ++, r ++) {
            sum += nums[r] - nums[l];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum/k;
    }
}
