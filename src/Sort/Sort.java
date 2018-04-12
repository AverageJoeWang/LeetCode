package Sort;

/**
 * Created by oliverwang on 2018/4/10.
 */


public class Sort {
    public void SelectSort(int []a){
        int temp;
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    
}
