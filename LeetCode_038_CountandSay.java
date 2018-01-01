/**
 * Created by wanglifei on 2018/1/1.
 */
public class LeetCode_038_CountandSay {
    public String countAndSay(int n) {
        if(n == 1) {
            return 1+"";
        }

        String result = "1";

        for(int i=2;i<=n;i++) {
            result = say(result);
        }

        return result;
    }

    public String say(String s) {
        String result = "";
        int count = 0;
        char c = '0';
        for(int i=0;i<s.length();i++) {
            c = s.charAt(i);
            if(count !=0) {
                if(s.charAt(i-1) != c) {
                    result = result + count + s.charAt(i-1);
                    count = 0;
                }
            }
            count++;
        }
        result = result + count + c;

        return result;
    }
}
