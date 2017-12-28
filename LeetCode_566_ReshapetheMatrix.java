/**
 * Created by wanglifei on 2017/12/28.
 */
public class LeetCode_566_ReshapetheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r*c != m*n) return nums;
        int [][] a = new int[r][c];
        for (int i = 0; i < r * c; i ++)
            a[i / c][i % c] = nums[i / m][i % m];
        return a;
    }
}
