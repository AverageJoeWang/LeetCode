/**
 * Created by oliverwang on 2018/3/22.
 */


public class JianZhiOffer32NumberOf1Between1AndN_Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        if (n < 1) return 0;
        int count = 0, base = 1, round = n;
        while (round > 0) {
            int weight = round % 10;
            round /= 10;
            count += round * base;
            if (weight == 1)
                count += (n % base) + 1;
            else if (weight > 1)
                count += base;
            base *= 10;
        }
        return count;
    }
}
