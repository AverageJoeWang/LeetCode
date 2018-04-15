package ClassicQuestion;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by oliverwang on 2018/4/15.
 */


public class treeBFSDFS {
    public void bfs(TreeNodes root){
        LinkedList<TreeNodes> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNodes nodes = queue.peekFirst();
            queue.removeFirst();
            System.out.println(nodes.val);
            if (nodes.left != null) queue.add(nodes.left);
            if (nodes.right != null) queue.add(nodes.right);
        }
    }

    public void dfs(TreeNodes root){
        Stack<TreeNodes> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNodes nodes = stack.pop();
            System.out.println(nodes.val);
            if (nodes.right != null) stack.push(nodes.right);
            if (nodes.left != null) stack.push(nodes.left);
        }
    }
}
