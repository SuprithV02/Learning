
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
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lh, rh);
    }

    public static void main(String args[]) {
        /*
         * Constructing this tree:
         * 1
         * / \
         * 2 3
         * /
         * 4
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        int depth = maxDepth(root);
        System.out.println("Maximum depth of the tree: " + depth);
    }
}
