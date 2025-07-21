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

    public static void rootToLeaf(TreeNode root, List<Integer> current, List<List<Integer>> answer) {

        if (root == null)
            return;

        current.add(root.val);

        if (root.left == null && root.right == null) {
            answer.add(new ArrayList<>(current));
        } else {
            rootToLeaf(root.left, current, answer);
            rootToLeaf(root.right, current, answer);
        }

        current.remove(current.size() - 1);
    }

    public static List<List<Integer>> allRootToLeaf(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        if (root == null)
            return answer;

        rootToLeaf(root, current, answer);
        return answer;
    }

    public static void main(String[] args) {
        // Sample tree:
        // 1
        // / \
        // 2 3
        // / \
        // 4 5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<List<Integer>> paths = allRootToLeaf(root);

        // Print the paths
        for (List<Integer> path : paths) {
            System.out.println(path);
        }
    }
}
