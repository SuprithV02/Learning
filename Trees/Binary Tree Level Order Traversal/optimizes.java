import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class optimizes {
    public static List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> answer = new ArrayList<>();

        if (root == null)
            return answer;

        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();

            List<Integer> subList = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                if (q.peek().left != null)
                    q.offer(q.peek().left);
                if (q.peek().right != null)
                    q.offer(q.peek().right);
                subList.add(q.poll().val);
            }

            answer.add(subList);
        }

        return answer;

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
