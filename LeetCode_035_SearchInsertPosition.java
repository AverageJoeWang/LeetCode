/**
 * Created by wanglifei on 2017/12/24.
 */
public class LeetCode_035_SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        if (nums.length >= 1 && target < nums[index])
            return 0;
        while (index < nums.length)
        {
            if (nums[index] == target)
                break;
            else if (nums[index] > target)
            {
                if ((index >= 1) && (nums[index-1] < target))
                {
                    break;
                }
            }
            index++;
        }
        return index;
    }
}
