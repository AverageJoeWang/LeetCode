package zijietiaodong;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by oliverwang on 2018/5/7.
 */


public class t1 {
    public static void main(String[] args){
        HashMap<Character, Integer> a = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().trim();
        for (int i = 0; i < str.length(); i++){//第一步将java放入键值对里面。统计个数
            if (a.containsKey(str.charAt(i))){
                a.put(str.charAt(i), a.get(str.charAt(i)) + 1);
            }else {
                a.put(str.charAt(i), 1);
            }
        }
        for (int i = 0; i < str.length(); i++){
            if (a.get(str.charAt(i)) == 1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
