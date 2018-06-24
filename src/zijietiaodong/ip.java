package zijietiaodong;



/**
 * Created by oliverwang on 2018/5/9.
 */

import java.util.Scanner;

public class ip {
    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine().trim();
        String [] str = ip.split("\\.");
        int flag = 0;
        if (str.length != 4) flag = 1;
        else {
            for (int i = 0; i < str.length; i++){
                if (Integer.parseInt(str[0]) >= 0 && Integer.parseInt(str[0]) <= 255)
                    continue;
                else {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) System.out.println("合法");
        else System.out.println("不合法");
    }
}
