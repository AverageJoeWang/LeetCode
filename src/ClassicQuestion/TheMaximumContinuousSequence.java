package ClassicQuestion;

/**
 * Created by oliverwang on 2018/4/14.
 */


public class TheMaximumContinuousSequence {

    public int TheMaximumContinuousSequence(int []a){
        int maxSum = 0;
        int cur = 0;
        for (int i = 0; i < a.length; i++){
            if (cur > 0){
                cur += a[i];
            }else {
                cur = a[i];
            }
            if (cur > maxSum)
                maxSum = cur;
        }
        return maxSum;
    }

    public static void main(String args[]) {
        TheMaximumContinuousSequence theMaximumContinuousSequence = new TheMaximumContinuousSequence();
        int[] arr = { -3, 2, -1, 4, -3 };
        System.out.println(theMaximumContinuousSequence.TheMaximumContinuousSequence(arr));
    }
}
