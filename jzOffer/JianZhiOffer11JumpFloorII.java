/**
 * Created by oliverwang on 2018/3/11.
 */


public class JianZhiOffer11JumpFloorII {
    public int JumpFloorII(int target) {
        int count[] = new int[101];
        count[0] = 1;
        count[1] = 1;
        count[2] = 2;
        int index = 2;
        if (target <= index) return count[target];
        if (target > 100) target = 100;
        for (int i = index + 1; i <= target; i++){
            count[i] = 2*count[i-1];
        }
        index = target;
        return count[index];
    }
}
