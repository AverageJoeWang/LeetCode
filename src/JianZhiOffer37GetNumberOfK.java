/**
 * Created by oliverwang on 2018/3/24.
 */


public class JianZhiOffer37GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (count != 0 && array[i] != k)
                break;
            if (array[i] == k) count++;
        }
        return count;
    }
}
