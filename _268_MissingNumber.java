/**
 * Created by wanglifei on 2017/12/18.
 */
public class _268_MissingNumber {//o(n)space, o(n) in time
    public int missingNumber(int[] nums) {
        int count[];
        count = new int[nums.length + 1];
        int k = -1;
        for (int i = 0; i < nums.length; i++)//利用哈希表来统计数字出现，
            count[nums[i]] = 1;
        for (int j = 0; j < count.length; j++)//遍历hash表找出相应的数字
            if (count[j] == 0)
            {
                k = j;
                break;
            }
        return k;
    }
}
