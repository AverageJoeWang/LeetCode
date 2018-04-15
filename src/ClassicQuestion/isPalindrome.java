package ClassicQuestion;

/**
 * Created by oliverwang on 2018/4/15.
 */


public class isPalindrome {
    public static boolean isPalindrome(long n){
        long k = 0, temp = n;
        while (temp != 0){
            k += temp%10;
            temp /= 10;
            if (temp != 0) k *= 10;
        }
        return k == n;
    }

    public static void main(String args[]) {
        System.out.println(isPalindrome(1231));
    }
}
