/**
 * Created by wanglifei on 2017/12/25.
 */
public class LeetCode_674_LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        int num = 1, increaseNum = 1;
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] > nums[i - 1])
                increaseNum += 1;
            else {
                num = num > increaseNum ? num : increaseNum;
                increaseNum = 1;
            }
        }
        return num > increaseNum ? num : increaseNum;
    }
}
