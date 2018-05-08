package zijietiaodong;

/**
 * Created by oliverwang on 2018/5/7.
 */


public class t2 {
    public static void main(String[] args){
        int [] a = {1,2,3,-1,-2,-3};
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < a.length; i++){
            if (sum >= 0){
                sum += a[i];
            }else sum = a[i];
            if (sum > maxSum)
                maxSum = sum;
        }
        System.out.println(maxSum);
    }
}
