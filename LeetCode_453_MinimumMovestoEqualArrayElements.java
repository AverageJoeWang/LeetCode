/**
 * Created by oliverwang on 2018/2/11.
 */


public class LeetCode_453_MinimumMovestoEqualArrayElements {
    public int minMoves(int[] nums) {
        int min= Integer.MAX_VALUE;
        int sum = 0;
        for(int n:nums){
            min = Math.min(min, n);
            sum+=n;
        }
        return sum-nums.length*min;
    }
}
