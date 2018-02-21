/**
 * Created by oliverwang on 2018/2/21.
 */


public class LeetCode_762_PrimeNumberofSetBitsinBinaryRepresentation {
    public int countPrimeSetBits(int L, int R) {
        int result = 0;
        for (int i = L; i <= R; i++) {
            int num = countNum(i);
            if (judge(num))
                result++;
        }
        return result;
    }

    private int countNum(int num) {
        int result = 0;
        do {
            if (num % 2 != 0)
                result++;
            num = num >> 1;
        } while (num > 0);
        return result;
    }

    private boolean judge(int num) {
        boolean result = true;
        if (num == 1)
            return false;
        if (num == 2 || num == 3)
            return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
