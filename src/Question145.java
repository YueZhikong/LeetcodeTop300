import java.util.ArrayList;
import java.util.List;

public class Question145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            LRD(root, result);
        }
        return result;
    }

    private void  LRD(TreeNode root, List<Integer> result){
        if (root==null){
            return;
        }
        LRD(root.left,result);
        LRD(root.right,result);
        result.add(root.val);
    }
}
