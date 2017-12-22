/**
 * Created by wanglifei on 2017/12/17.
 */
public class LeetCode_697_DegreeofanArray {
    public int findShortestSubArray(int[] nums) {
        int count[];
        count = new int[50000];
        int maxCount = 1, cnt, minCount = 50001;
        for (int i = 0; i < nums.length; i++)//hash列表统计每个数字出现的次数，记录出现最大次数(degree)
        {
            if (count[nums[i]] == -1)
                count[nums[i]] = 1;
            else
            {
                count[nums[i]] = count[nums[i]] + 1;
                if (count[nums[i]] > maxCount)
                    maxCount = count[nums[i]];
            }
        }
        for (int i = 0; i < count.length; i++)//遍历hash表
        {
            cnt = 0;
            if (maxCount == count[i])//取得最大出现次数，因为可能出现次数相同但是数值不一样的数字
            {
                int k = maxCount;
                for (int j = 0; j < nums.length; j++)//遍历原数组，统计记录最小子列
                {
                    if (k == 0)
                        break;
                    if (nums[j] == i)
                    {
                        k--;
                        cnt++;
                    }
                    if (nums[j] != i && k != maxCount)
                        cnt++;
                }
                if (cnt < minCount)
                    minCount = cnt;
            }
        }
        return minCount;
    }
}
