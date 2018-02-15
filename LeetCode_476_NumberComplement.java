/**
 * Created by oliverwang on 2018/2/15.
 */


public class LeetCode_476_NumberComplement {
    public int findComplement(int num) {
        int i = 0;
        int j = 0;

        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
        }

        return i - num;
    }
}
