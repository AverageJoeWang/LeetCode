/**
 * Created by wanglifei on 2017/12/30.
 */
public class LeetCode_189_RotateArray {
    public void rotate(int[] nums, int k) {
        k = (nums.length + (k % nums.length)) % nums.length;
        int temp;
        for (int i = 0, j = nums.length - 1; i < j; i++, j--)
        {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (int i = k, j = nums.length - 1; i < j; i++, j--)
        {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        for (int i = 0, j = k - 1; i < j; i++, j--)
        {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
