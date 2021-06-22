public class Question112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root,targetSum,0);
    }

    public boolean hasPathSum(TreeNode root,int targetSum,int sum){
        if (root==null){
            return false;
        }
        sum = sum + root.val;
        if (sum == targetSum && root.left==null && root.right ==null){
            return true;
        }
        return hasPathSum(root.left,targetSum,sum)||hasPathSum(root.right,targetSum,sum);
    }
}
