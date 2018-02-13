/**
 * Created by oliverwang on 2018/2/13.
 */


public class LeetCode_415_AddStrings {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        String result = "";
        while(i >= 0 || j >= 0 || carry >0)
        {
            int sum = 0;
            if(i >= 0)
            {
                sum += num1.charAt(i) - '0';
            }
            if(j >= 0)
            {
                sum += num2.charAt(j) -'0';
            }
            sum += carry;
            carry = (int)sum / 10;
            sum = sum % 10;
            result = String.valueOf(sum) + result;
            i--;
            j--;
        }
        return result;
    }
}
