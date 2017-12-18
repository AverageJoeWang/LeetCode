/**
 * Created by wanglifei on 2017/12/18.
 */
public class _268_MissingNumber {
    public int missingNumber(int[] nums) {
        int count[];
        count = new int[nums.length + 1];
        int k = -1;
        for (int i = 0; i < nums.length; i++)
            count[nums[i]] = 1;
        for (int j = 0; j < count.length; j++)
            if (count[j] == 0)
                k = j;
        return k;
    }
}
