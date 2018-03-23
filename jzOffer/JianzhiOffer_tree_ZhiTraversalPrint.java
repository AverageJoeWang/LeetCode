import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by oliverwang on 2018/3/5.
 */

//2个栈，奇数层的时候一个栈，偶数层的时候存一个栈
//当奇数层的时候是将奇数层里面每个节点的左子树先进偶数层的栈，然后是右子树进偶数层的栈
//当偶数层的时候是将偶数层里面每个节点的右子树先进奇数层的栈，然后是左子树进奇数层的栈
//token%2==1的时候为奇数栈，token%2==0的时候是偶数栈，
//temp是记录每一层的节点数
public class JianzhiOffer_tree_ZhiTraversalPrint {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) return res;
        Stack<TreeNode> oodStack = new Stack<>();
        Stack<TreeNode> evenStack = new Stack<>();
        oodStack.push(pRoot);
        int n, temp = 1, token = 1;//token是左右的标志
        while (!evenStack.empty() || !oodStack.empty()){
            n = temp;
            temp = 0;
            ArrayList<Integer> a = new ArrayList<>();
            while (n-- != 0) {
                if (token % 2 == 1) {
                    TreeNode node = oodStack.pop();
                    a.add(node.val);
                    if (node.left != null) {
                        evenStack.push(node.left);
                        temp++;
                    }
                    if (node.right != null) {
                        evenStack.push(node.right);
                        temp++;
                    }
                } else {
                    TreeNode node = evenStack.pop();
                    a.add(node.val);
                    if (node.right != null) {
                        oodStack.push(node.right);
                        temp++;
                    }
                    if (node.left != null) {
                        oodStack.push(node.left);
                        temp++;
                    }
                }
            }
            res.add(a);
            token++;
        }
        return res;
    }
}
