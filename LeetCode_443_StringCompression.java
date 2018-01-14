import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by oliverwang on 2018/1/14.
 */


public class LeetCode_443_StringCompression {
    public int compress(char[] chars) {
        if(chars.length == 0) return 0;
        int mark = 0;
        int write = 0;
        for(int i = 0; i < chars.length; i++){
            if(i + 1 == chars.length || chars[i] != chars[i+1]){
                chars[write] = chars[mark];
                write++;
                if(mark < i){
                    for(char a : (""+(i-mark+1)).toCharArray())
                        chars[write++] = a;
                }
                mark = i + 1;
            }
        }
        return write;
    }
}
