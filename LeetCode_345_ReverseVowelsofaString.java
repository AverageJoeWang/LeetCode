import java.util.HashMap;

/**
 * Created by wanglifei on 2018/1/11.
 */
public class LeetCode_345_ReverseVowelsofaString {

    public static boolean checkVowel(char c) {
        if ('a' == c || 'e' == c || 'i' == c || 'o' == c || 'u' == c
                || 'A' == c || 'E' == c || 'I' == c || 'O' == c || 'U' == c) {
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {
        if (s == null || s.length() <= 1) return s;
        int i = 0, j = s.length() -1;
        char [] res = s.toCharArray();
        while (i < j)
        {
            if (checkVowel(res[i]) && checkVowel(res[j]))
            {
                if (res[i] != res[j])
                {
                    char temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
                i++;
                j--;
            }
            else {
                if (!checkVowel(res[i]))
                    i++;
                if (!checkVowel(res[j]))
                    j--;
            }
        }
        return new String(res);
    }
}
