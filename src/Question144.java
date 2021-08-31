import java.util.ArrayList;
import java.util.List;

public class Question144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root==null){
            return result;
        }else {
            VLR(root,result);
            return result;
        }
    }

    private void  VLR(TreeNode root,List<Integer> result){
        if (root==null){
            return;
        }
        VLR(root.left,result);
        VLR(root.right,result);
        result.add(root.val);
    }
    //todo 迭代
}
