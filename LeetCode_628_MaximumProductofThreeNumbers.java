import java.util.Arrays;

/**
 * Created by wanglifei on 2017/12/28.
 */
public class LeetCode_628_MaximumProductofThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = nums[0]*nums[1]*nums[2];
        sum = Math.max(sum, nums[n-1]*nums[n-2]*nums[n-3]);
        sum = Math.max(sum, nums[0]*nums[n-1]*nums[n-2]);
        sum = Math.max(sum, nums[0]*nums[1]*nums[n-1]);
        return sum;
    }
}
