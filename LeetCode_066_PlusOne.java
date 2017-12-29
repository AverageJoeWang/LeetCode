import java.util.Arrays;

/**
 * Created by wanglifei on 2017/12/29.
 */
public class LeetCode_066_PlusOne {
    public int[] plusOne(int[] digits) {
        int i;
        int newDidits[];
        for (i = digits.length - 1; i >= 0; i--)
        {
            if (digits[i] != 9){
                ++digits[i];
                break;
            }else digits[i] = 0;
        }
        if (i < 0)
        {
            newDidits = new int[digits.length + 1];
            newDidits[0] = 1;
            for (int j = 1; j < digits.length; j++)
                newDidits[j] = digits[j - 1];
            return newDidits;
        }else return digits;
    }
}
