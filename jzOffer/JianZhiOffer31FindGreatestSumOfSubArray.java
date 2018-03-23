/**
 * Created by oliverwang on 2018/3/21.
 */


public class JianZhiOffer31FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < array.length; i++){
            if (sum < 0) sum = array[i];
            else sum += array[i];
            if (sum > maxSum) maxSum = sum;
        }
        return maxSum;
    }
}
