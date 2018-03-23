import java.util.ArrayList;

/**
 * Created by oliverwang on 2018/3/18.
 */


public class JianZhiOffer24FindPath {
    private ArrayList<Integer> list = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root == null) return listAll;
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null){
            listAll.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1);
        return listAll;
    }
}
