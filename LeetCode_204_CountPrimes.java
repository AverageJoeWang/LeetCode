/**
 * Created by oliverwang on 2018/2/13.
 */


public class LeetCode_204_CountPrimes {
    public int countPrimes(int n) {
        if (n <= 1) return 0;
        boolean[] notPrime = new boolean[n];
        notPrime[0] = true;
        notPrime[1] = true;
        for (int i = 2; i * i < n; i++)
            if (!notPrime[i])
                for (int j = 2 * i; j < n; j += i)
                    notPrime[j] = true;
        int result = 0;
        for (boolean b : notPrime)
            if (!b) result++;
        return result;
    }
}
