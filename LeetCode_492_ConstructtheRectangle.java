/**
 * Created by oliverwang on 2018/2/22.
 */


public class LeetCode_492_ConstructtheRectangle {
    public int[] constructRectangle(int area) {
        int[] res = {0 ,0};
        for(int i = 1; i <= (int)Math.sqrt(area); i++){
            if(area % i == 0){
                res[1] = i;
                res[0] = area / i;
            }
        }
        return res;
    }
}
