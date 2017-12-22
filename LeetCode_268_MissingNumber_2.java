/**
 * Created by wanglifei on 2017/12/18.
 */
public class LeetCode_268_MissingNumber_2 {//o(1)space, o(n) in time
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int x : nums)//0-n的和为(1+n)*(n+1)/2
            sum += x;
        return (nums.length*(nums.length + 1))/2 - sum;
    }
}
