/**
 * Created by oliverwang on 2018/3/23.
 */


public class JianZhiOffer34GetUglyNumber_Solution {

    int GetUglyNumber_Solution(int index) {
//动态规划，对于第i个数，它一定是之前已存在数的2倍，3倍或5倍
        if (index <= 0)
            return 0;
        int buf[] = new int[index];
        buf[0] = 1;
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        for (int i = 1; i < index; ++i) {
            buf[i] = Math.min(buf[s1] * 2, Math.min(buf[s2] * 3, buf[s3] * 5));
            if (buf[i] == buf[s1] * 2) s1++;
            if (buf[i] == buf[s2] * 3) s2++;
            if (buf[i] == buf[s3] * 5) s3++;
        }
        return buf[index - 1];
    }
//    private final int d[] = { 2, 3, 5 };
//    public int GetUglyNumber_Solution(int index) {
//        if(index == 0) return 0;
//        int a[] = new int[index];
//        a[0] = 1;
//        int p[] = new int[] { 0, 0, 0 };
//        int num[] = new int[] { 2, 3, 5 };
//        int cur = 1;
//
//        while (cur < index) {
//            int m = finMin(num[0], num[1], num[2]);
//            if (a[cur - 1] < num[m])
//                a[cur++] = num[m];
//            p[m] += 1;
//            num[m] = a[p[m]] * d[m];
//        }
//        return a[index - 1];
//    }
//
//    private int finMin(int num2, int num3, int num5) {
//        int min = Math.min(num2, Math.min(num3, num5));
//        return min == num2 ? 0 : min == num3 ? 1 : 2;
//    }
}