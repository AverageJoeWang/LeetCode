/**
 * Created by wanglifei on 2017/12/25.
 */
public class LeetCode_747_LargestNumberGreaterThanTwiceofOthers {
    public int dominantIndex(int[] nums) {
        int maxNum = -2, seMaxNum = -1, cMaxNum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (maxNum < nums[i])
            {
                seMaxNum = maxNum;
                maxNum = nums[i];
                cMaxNum = i;
            } else if (seMaxNum < nums[i])
                seMaxNum = nums[i];
        }
        System.out.println(maxNum);
        System.out.println(seMaxNum);
        System.out.println(cMaxNum);
        if (maxNum >= seMaxNum * 2)
            return cMaxNum;
        else
            return -1;
    }
}
