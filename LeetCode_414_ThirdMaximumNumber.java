import java.util.Arrays;

/**
 * Created by wanglifei on 2017/12/26.
 */
public class LeetCode_414_ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        long tmp[] = {Long.MIN_VALUE,Long.MIN_VALUE,Long.MIN_VALUE};
        for(int num:nums){
            if(num< tmp[1] && num>tmp[0]){
                tmp[0]=num;
            }
            else if (num < tmp[2] && num > tmp[1]){
                tmp[0] = tmp[1];
                tmp[1] = num;
            }
            else if (num > tmp[2]){
                tmp[0] = tmp[1];
                tmp[1] = tmp[2];
                tmp[2] = num;
            }
        }
        if(tmp[0] == Long.MIN_VALUE){
            return (int)tmp[2];
        }
        return (int)tmp[0];
    }
}
