/**
 * Created by oliverwang on 2018/3/11.
 */


public class JianZhiOffer10JumpFloor {
    public int jumpFloor(int target) {
        int res [] = {0, 1, 2};
        if (target <= 2) return res[target];
        else {
            int sum = 0;
            int step1 = 1;
            int step2 = 2;
            for (int i = 3; i <= target; i++){
                sum = step1 + step2;
                step1 = step2;
                step2 = sum;
            }
            return sum;
        }
    }
}
