/**
 * Created by oliverwang on 2018/3/11.
 */


public class JianZhiOffer12RectCover {
    public int RectCover(int target) {
        if(target <= 2)
            return target;
        return RectCover(target - 1) + RectCover(target - 2);
    }
}
