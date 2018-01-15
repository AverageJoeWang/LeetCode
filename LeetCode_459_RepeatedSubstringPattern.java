/**
 * Created by oliverwang on 2018/1/15.
 */


public class LeetCode_459_RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        if(s == null || s.length() == 0) return true;
        for(int i = s.length()/2 ; i >= 1 ; i--){
            if(s.length() % i == 0){
                int m = s.length()/i;
                String repeatP = s.substring(0,i);
                int j = 0;
                for(; j < m ; j++){
                    if(!repeatP.equals(s.substring(i*j, i+j*i))) break;
                }
                if(j == m) return true;
            }
        }
        return false;
    }
}
