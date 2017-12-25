/**
 * Created by wanglifei on 2017/12/25.
 */
public class LeetCode_724_FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0)
            return -1;
        int leftSum = nums[0], rightSum = 0, index = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++)
            rightSum += nums[i];
        if (rightSum == leftSum)
            return 0;
        for (int j = 1; j < n; j++)
        {
            leftSum += nums[j];
            rightSum -= nums[j - 1];
            if (rightSum == leftSum)
            {
                index = j;
                break;
            }
        }
        System.out.println(leftSum);
        System.out.println(rightSum);
        return index;
    }
}
