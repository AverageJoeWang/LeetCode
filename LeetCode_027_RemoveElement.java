/**
 * Created by wanglifei on 2017/12/21.
 */
public class LeetCode_027_RemoveElement {
    public int removeElement(int[] nums, int val) {//o(1) in space, o(n) in time
        int i = 0, k = 0, n = nums.length;
        while (i != n){
            if (nums[i] != val)
                nums[k++] = nums[i];
            i++;
        }
        return k;
     }
}
