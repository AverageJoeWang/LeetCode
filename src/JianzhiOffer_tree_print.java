import java.util.ArrayList;

/**
 * Created by oliverwang on 2018/3/4.
 */


public class JianzhiOffer_tree_print {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) return res;
        ArrayList<TreeNode> arrayList = new ArrayList<>();
        arrayList.add(pRoot);
        int n, temp = 1;
        while (arrayList.size() != 0){
            ArrayList<Integer> a = new ArrayList<>();
            n = temp;
            temp = 0;
            while (n-- != 0){
                a.add(arrayList.get(0).val);
                if (arrayList.get(0).left != null) {
                    arrayList.add(arrayList.get(0).left);
                    temp++;
                }
                if (arrayList.get(0).right != null) {
                    arrayList.add(arrayList.get(0).right);
                    temp++;
                }
                arrayList.remove(0);
            }
            res.add(a);
        }
        return res;
    }
}
