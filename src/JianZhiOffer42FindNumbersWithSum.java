import java.util.ArrayList;

/**
 * Created by oliverwang on 2018/3/27.
 */


public class JianZhiOffer42FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>(2);
        int k = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] + array[j] == sum && k > array[i] * array[j]){
                    list.add(0, array[i]);
                    list.add(1, array[j]);
                    k = array[i] * array[j];
                }
                if (array[i] + array[j] > sum) break;
            }
            if (array[i] > sum) break;
        }
        if (!list.isEmpty() && list.get(0) > list.get(1)){
            int temp = list.get(1);
            list.add(1, list.get(0));
            list.add(0,temp);
        }
        return list;
    }
}
