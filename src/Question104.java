public class Question104 {
    public int maxDepth(TreeNode root) {
        return findMaxDepth(root,0);
    }

    public int findMaxDepth(TreeNode root,int depth){
        if (root == null){
            return depth;
        }else {
            depth++;
            return Math.max(findMaxDepth(root.left,depth),findMaxDepth(root.right,depth));
        }
    }
}
