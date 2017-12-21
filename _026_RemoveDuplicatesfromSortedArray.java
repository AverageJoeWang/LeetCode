/**
 * Created by wanglifei on 2017/12/21.
 */
public class _026_RemoveDuplicatesfromSortedArray {//o(1) in space, o(n) in time
    public int removeDuplicates(int[] nums) {
        int  i = 0, k = 0, n = nums.length, res = 0;
        if(n!=0) res = nums[0] - 1;
        while (i != n){
            if (res != nums[i])
            {
                res = nums[i];
                nums[k++] = res;
            }
            i++;
        }
        return k;
    }
}
