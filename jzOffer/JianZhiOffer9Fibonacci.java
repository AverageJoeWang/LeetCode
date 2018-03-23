/**
 * Created by oliverwang on 2018/3/11.
 */


public class JianZhiOffer9Fibonacci {
    public int Fibonacci(int n) {
        int result[] = {0,1};
        if (n < 2) return result[n];
        int fabone = 1, fabtwo = 0, fabN = 0;
        for (int i = 2; i <= n; i++){
            fabN = fabone + fabtwo;
            fabtwo = fabone;
            fabone = fabN;
        }
        return fabN;
    }
}
