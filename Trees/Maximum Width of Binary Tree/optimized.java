import java.util.LinkedList;
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

class TreeWidth {
    TreeNode node;
    int num;

    TreeWidth(TreeNode node, int num) {
        this.node = node;
        this.num = num;
    }
}

public class optimized {
    public static int widthOfBinaryTree(TreeNode root) {

        if (root == null)
            return 0;

        Queue<TreeWidth> q = new LinkedList<>();
        int ans = 0;
        q.offer(new TreeWidth(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            int minValue = q.peek().num;
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                int cur_id = q.peek().num - minValue;
                TreeNode node = q.peek().node;
                q.poll();

                if (i == 0)
                    first = cur_id;
                if (i == size - 1)
                    last = cur_id;
                if (node.left != null) {
                    q.offer(new TreeWidth(node.left, 2 * cur_id + 1));
                }
                if (node.right != null) {
                    q.offer(new TreeWidth(node.right, 2 * cur_id + 2));
                }
            }

            ans = Math.max(ans, last - first + 1);

        }

        return ans;
    }

    public static void main(String args[]) {

    }
}
