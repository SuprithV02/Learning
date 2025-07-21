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
    public List<Integer> leftSideView(TreeNode root) {

        List<Integer> answer = new ArrayList<>();

        leftSideRecursion(root, 0, answer);

        return answer;
    }

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> answer = new ArrayList<>();

        rightSideRecursion(root, 0, answer);

        return answer;
    }

    private static void leftSideRecursion(TreeNode root, int length, List<Integer> answer) {

        if (root == null) {
            return;
        }

        if (length == answer.size()) {
            answer.add(root.val);
        }

        leftSideRecursion(root.left, length + 1, answer);
        leftSideRecursion(root.right, length + 1, answer);
    }

    private static void rightSideRecursion(TreeNode root, int length, List<Integer> answer) {
        if (root == null) {
            return;
        }

        if (length == answer.size()) {
            answer.add(root.val);
        }

        rightSideRecursion(root.right, length + 1, answer);
        rightSideRecursion(root.left, length + 1, answer);
    }

    public static void main(String[] args) {
        // Sample tree:
        // 1
        // / \
        // 2 3
        // \ \
        // 5 4

        TreeNode root = new TreeNode(
                1,
                new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(4)));

        optimized opt = new optimized();

        List<Integer> leftView = opt.leftSideView(root);
        List<Integer> rightView = opt.rightSideView(root);

        System.out.println("Left Side View: " + leftView); // Expected: [1, 2, 5]
        System.out.println("Right Side View: " + rightView); // Expected: [1, 3, 4]
    }
}