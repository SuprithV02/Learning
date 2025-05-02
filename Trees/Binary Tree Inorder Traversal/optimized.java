import java.util.ArrayList;
import java.util.List;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class optimized {
    private List<Integer> res = new ArrayList<>();

    public  List<Integer> inorderTraversal(TreeNode root) {
        res.clear();
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        res.add(root.val);
        traverse(root.right);
    }

    public static void main(String args[]) {
        TreeNode tree = new TreeNode(1);
        tree.right = new TreeNode(2);
        tree.right.left = new TreeNode(3);

        optimized sol = new optimized();
        List<Integer> result = sol.inorderTraversal(tree);

        System.out.println("Inorder Traversal:");
        System.out.println(result);

    }
}
