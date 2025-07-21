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

public class dfsOptimized {
    int max = 0;

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        List<Integer> leftmopos = new ArrayList<>();
        dfs(root, 0, 0, leftmopos);
        return max;
    }

    private void dfs(TreeNode node, int depth, int position, List<Integer> leftmopos) {

        if (node == null)
            return;

        if (depth == leftmopos.size()) {
            leftmopos.add(position);
        }

        int currentWidth = position - leftmopos.get(depth) + 1;
        max = Math.max(max, currentWidth);

        dfs(node.left, depth + 1, 2 * position, leftmopos);
        dfs(node.right, depth + 1, 2 * position + 1, leftmopos);
    }

    public static void main(String[] args) {
        // Build a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(8);
        root.right.left.left = new TreeNode(9);

        dfsOptimized solution = new dfsOptimized();
        int maxWidth = solution.widthOfBinaryTree(root);
        System.out.println("Maximum Width of Binary Tree: " + maxWidth);
    }
}
