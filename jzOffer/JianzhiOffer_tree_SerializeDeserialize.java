/**
 * Created by oliverwang on 2018/3/5.
 */


public class JianzhiOffer_tree_SerializeDeserialize {
    String Serialize(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        if (root == null){
            stringBuilder.append("#,");
            return stringBuilder.toString();
        }
        stringBuilder.append(root.val + ",");
        stringBuilder.append(Serialize(root.left));
        stringBuilder.append(Serialize(root.right));
        return stringBuilder.toString();
    }
    int n = -1;
    TreeNode Deserialize(String str) {
        n++;
        int length = str.length();
        if (n >= length){
            return null;
        }
        String[] nodeStr = str.split(",");
        TreeNode node = null;
        if (!nodeStr[n].equals("#")){
            node = new TreeNode(Integer.valueOf(nodeStr[n]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;
    }
}
