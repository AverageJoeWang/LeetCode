/**
 * Created by oliverwang on 2018/2/8.
 */


public class LeetCode_598_RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
        int minrow=Integer.MAX_VALUE, mincol=Integer.MAX_VALUE;
        minrow=Math.min(minrow, m);
        mincol=Math.min(mincol, n);
        for(int i=0; i< ops.length; i++){
            minrow=Math.min(minrow, ops[i][0]);
            mincol=Math.min(mincol, ops[i][1]);
        }
        return minrow * mincol;
    }
}
