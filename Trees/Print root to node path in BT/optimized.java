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
    public static void getPath(TreeNode root, int target, List<Integer> path) {

        if (root == null) {
            return;
        }
        path.add(root.val);

        if (root.val == target)
            return;

        getPath(root.left, target, path);
        getPath(root.right, target, path);

        if (path.get(path.size() - 1) != target) {
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);

        int target = 5;
        List<Integer> path = new ArrayList<>();

        getPath(root, target, path);

        System.out.println("Path from root to " + target + ": " + path);
    }
}

// 1
// / \
// 2 3
// / \ \
// 4 5 6
