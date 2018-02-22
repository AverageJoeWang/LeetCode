/**
 * Created by oliverwang on 2018/2/22.
 */


public class LeetCode_371_SumofTwoIntegers {
    public int getSum(int a, int b) {
        while (b != 0){
            int temp = a ^ b;
            b = (a & b) << 1;
            a = temp;
        }
        return a;
    }
}
