/**
 * Created by wanglifei on 2017/12/22.
 */
public class LeetCode_605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean flag = true;
        for (int i = 0; i < flowerbed.length; ++i) {
            if (flowerbed[i] == 0) {
                if (flag) {
                    n--;
                    flag = false;
                } else
                    flag = true;
            } else {
                if (!flag && flowerbed[i - 1] == 0)
                    n++;
                flag = false;
            }
        }
        return n <= 0;
    }
}
