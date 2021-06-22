import java.util.LinkedList;
import java.util.Queue;

public class Question111 {
    public int minDepth(TreeNode root) {
        int result = 1;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeNode> queue1 = new LinkedList<>();
            for (TreeNode treeNode : queue) {
                if (treeNode == null) {
                    continue;
                } else {
                    if (treeNode.left==null&&treeNode.right==null){
                        return result;
                    }
                    queue1.add(treeNode.left);
                    queue1.add(treeNode.right);
                }
            }
            queue = queue1;
            result++;
        }
        ;
        return result;
    }
}
