import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanglifei on 2017/12/29.
 */
public class LeetCode_448_FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {//正负号标记法
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
        {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -Math.abs(nums[index]);
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0)
                list.add(i+1);
        }
        return list;
    }
}
