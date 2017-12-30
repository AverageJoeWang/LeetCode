/**
 * Created by wanglifei on 2017/12/30.
 */
public class LeetCode_485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 1) return nums[0];
        int count = 0, tempCount = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 1)
            {
                tempCount++;
            }else if (nums[i] == 0)
            {
                count = Math.max(count, tempCount);
                tempCount = 0;
            }
        }
        count = Math.max(count, tempCount);
        return count;
    }
}
