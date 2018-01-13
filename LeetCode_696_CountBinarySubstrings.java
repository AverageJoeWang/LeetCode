/**
 * Created by oliverwang on 2018/1/13.
 */


public class LeetCode_696_CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int count = 0;
        int total = 1;
        int sum = 0;
        int begin = 0;
        char[] sArray = s.toCharArray();
        if(sArray.length == 1) return 0;
        int judge = sArray[0];
        for(int i = 1; i < sArray.length; ++i){
            if( sArray[i] == judge)  ++total;
            if( sArray[i] != judge && sArray[i-1] == judge ){
                begin = i;
                for(;i < sArray.length && sArray[i] !=judge; ++i){
                    count ++;
                }
                sum += Math.min(total,count);
                total = 1;
                count = 0;
                i = begin;
                judge = sArray[i];
            }

        }
        return sum;
    }
}
