/**
 * Created by wanglifei on 2017/12/30.
 */
public class LeetCode_167_TwoSumII_InputArrayisSorted {
    public int[] twoSum(int[] numbers, int target) {
        int [] res = new int[2];
        int left = 0, right = numbers.length - 1;
        while (left < right)
        {
            int tempSum = numbers[left] + numbers[right];
            if (tempSum == target)
            {
                res[0] = left+1;
                res[1] = right+1;
                break;
            }else if (tempSum < target){
                left++;
            }else
                right--;
        }
        return res;
    }
}
