/**
 * Created by oliverwang on 2018/3/26.
 */


public class JianZhiOffer40FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length < 2) return;
        int cx = 0, flag = 1;
        for (int i = 0; i < array.length; i++){
            cx ^= array[i];
        }
        while ((cx & flag) == 0) flag <<= 1;
        for (int i = 0; i < array.length; i++){
            if ((flag & array[i]) == 0)
                num2[0] ^= array[i];
            else num1[0] ^= array[i];
        }
    }
}
