/**
 * Created by oliverwang on 2018/2/12.
 */

//首先除2，直到不能整除为止
// 然后除3到不能整除为止，
// 然后除5直到不能整除为止。
// 最终判断剩余的数字是否为1，
// 如果是1则为丑数，否则不是丑数。
public class LeetCode_263_UglyNumber {
    public boolean isUgly(int num) {
        if (num <= 0) return false;
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }
}
