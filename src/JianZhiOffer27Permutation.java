import java.util.ArrayList;
import java.util.Stack;
import java.util.TreeSet;

/**
 * Created by oliverwang on 2018/3/20.
 */


public class JianZhiOffer27Permutation {
    public ArrayList<String> Permutation(String str) {
        TreeSet<String> tree = new TreeSet<String>();
        Stack<String[]> stack = new Stack<String[]>();
        ArrayList<String> results = new ArrayList<String>();
        stack.push(new String[]{str,""});
        do{
            String[] popStrs = stack.pop();
            String oldStr = popStrs[1];
            String statckStr = popStrs[0];
            for(int i =statckStr.length()-1;i>=0;i--){
                String[] strs = new String[]{statckStr.substring(0,i)+statckStr.substring(i+1),oldStr+statckStr.substring(i,i+1)};
                if(strs[0].length()==0){
                    tree.add(strs[1]);
                }else{
                    stack.push(strs);
                }
            }
        }while(!stack.isEmpty());
        for(String s : tree)
            results.add(s);
        return results;
    }
}
