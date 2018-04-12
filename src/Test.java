import Sort.Sort;

/**
 * Created by oliverwang on 2018/4/10.
 */


public class Test {
    public static void main(String[] args){
        Sort sort = new Sort();
        int a[] = {5,7,1,8,4};
//        sort.QuickSort(a, 0, a.length - 1);
        sort.BubbleSort(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
