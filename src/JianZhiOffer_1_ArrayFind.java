/**
 * Created by oliverwang on 2018/3/11.
 */


public class JianZhiOffer_1_ArrayFind {
    public boolean Find(int target, int[][] array) {
        int rows = array.length;//行
        int cols = array[0].length;//列
        int i = rows - 1;
        int j = 0;
        while (i >= 0 && j < cols) {
            if (array[i][j] < target) j++;
            else if (array[i][j] > target) i--;
            else return true;
        }
        return false;
    }
}
