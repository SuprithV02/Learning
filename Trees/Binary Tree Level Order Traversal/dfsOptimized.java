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
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        dfs(root, 0, answer);
        return answer;
    }

    public static void dfs(TreeNode root, int level, List<List<Integer>> answer) {

        if (root == null)
            return;

        if (level == answer.size()) {
            answer.add(new ArrayList<>());
        }

        answer.get(level).add(root.val);

        dfs(root.left, level + 1, answer);
        dfs(root.right, level + 1, answer);
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        /*
         * 1
         * / \
         * 2 3
         * / \ \
         * 4 5 6
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        // Call the levelOrder method
        List<List<Integer>> result = levelOrder(root);

        // Print the result
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
