/**
 * Created by wanglifei on 2018/1/5.
 */
public class LeetCode_557_ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        String [] res = s.split(" ");
        StringBuilder stb = new StringBuilder();
        int n = 0;
        for (int i = 0; i < res.length; i++)
        {
            char [] temp = res[i].toCharArray();
            int left = 0, right = temp.length - 1;
            while (left < right)
            {
                char a = temp[left];
                temp[left] = temp[right];
                temp[right] = a;
                left++;
                right--;
            }
            if (n == 0 && temp.length != 0)
            {
                stb.append(new String(temp));
                n = 1;
            }else if (n == 1 && temp.length != 0)
                stb.append(" ").append(new String(temp));
        }
        return stb.toString();
    }
}
