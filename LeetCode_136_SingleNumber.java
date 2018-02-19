/**
 * Created by oliverwang on 2018/2/19.
 */

//找出nums中出现一次的数字
public class LeetCode_136_SingleNumber {
    public int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[0] ^= nums[i];
        return nums[0];
    }
}
