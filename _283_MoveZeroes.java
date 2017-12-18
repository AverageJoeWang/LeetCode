/**
 * Created by wanglifei on 2017/12/18.
 */
public class _283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count[];
        count = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
                count[j++] = nums[i];
        }
        for (int k = 0; k < nums.length; k++)
            nums[k] = count[k];
    }
}
