import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Question101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        List<TreeNode> list = new LinkedList();
        list.add(root);
        while (list.size() != 0) {
            List<TreeNode> line = new LinkedList();
            for (TreeNode node : list) {
                if (node != null) {
                    line.add(node.left);
                    line.add(node.right);
                }
            }
            if (line.size() == 0) {
                break;
            }
            if (!checkIsSymmetry(line)) {
                return false;
            }
            list = line;
        }
        return true;
    }

    private boolean checkIsSymmetry(List<TreeNode> list) {
        if (list.size() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                if (list.get(list.size() - i - 1) != null) {
                    return false;
                }
            } else {
                if (list.get(list.size()-i-1)==null){
                    return false;
                }
                if (list.get(i).val!=(list.get(list.size() - i - 1).val)) {
                    return false;
                }
            }
        }
        return true;
    }

	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(1);
		treeNode.left = new TreeNode(2);
		treeNode.right = new TreeNode(3);
        System.out.println(new Question101().isSymmetric(treeNode));
	}
}