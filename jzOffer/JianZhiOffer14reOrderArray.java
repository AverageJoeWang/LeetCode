/**
 * Created by oliverwang on 2018/3/13.
 */


public class JianZhiOffer14reOrderArray {
    public void reOrderArray(int[] array) {
        for (int i = 0; i < array.length; i++) {//奇数区边界位置
            for (int j = i; j < array.length; j++) {
                if ((array[j] & 1) == 1) {//奇数
                    int temp = array[j];
                    for (int k = j; j > i; j--) {
                        array[j] = array[j - 1];
                    }
                    array[i] = temp;
                    break;
                }
            }
        }
    }
}
