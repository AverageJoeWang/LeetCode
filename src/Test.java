import Sort.Sort;

/**
 * Created by oliverwang on 2018/4/10.
 */


public class Test {
    public static void main(String[] args){
        Sort sort = new Sort();
        int a[] = {2,3,6,1,0};
        sort.SelectSort(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
