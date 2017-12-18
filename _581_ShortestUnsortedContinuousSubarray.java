import java.util.Arrays;

/**
 * Created by wanglifei on 2017/12/19.
 */
public class _581_ShortestUnsortedContinuousSubarray {//o(n)space, o(n) in time
    public int findUnsortedSubarray(int[] nums) {//利用新数组排序，对比
        int n = nums.length;
        int arr[];
        arr = new int[n];
        int start = 0, end = n - 1;
        for (int i = 0; i < n; i++)
            arr[i] = nums[i];
        Arrays.sort(nums);
        for (int i = 0; i < n; i++)
            if (nums[i] == arr[i])
                start++;
            else break;
        for (int i = n - 1; i > start; i--)
            if (nums[i] == arr[i])
                end--;
            else break;
        return end - start + 1;
    }
}
