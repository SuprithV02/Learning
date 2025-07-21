import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

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

public class dfsSolution {
    private static TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map;

    public static List<List<Integer>> verticalTraversal(TreeNode root) {

        map = new TreeMap<>();

        dfs(root, 0, 0);

        List<List<Integer>> result = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            List<Integer> col = new ArrayList<>();
            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {
                    col.add(nodes.poll());
                }
            }
            result.add(col);
        }

        return result;
    }

    public static void dfs(TreeNode node, int x, int y) {

        if (node == null)
            return;

        map.putIfAbsent(x, new TreeMap<>());
        map.get(x).putIfAbsent(y, new PriorityQueue<>());
        map.get(x).get(y).offer(node.val);

        dfs(node.left, x - 1, y + 1);
        dfs(node.right, x + 1, y + 1);
    }

    public static void main(String[] args) {
        /*
         * 3
         * / \
         * 9 20
         * / \
         * 15 7
         */

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        List<List<Integer>> result = verticalTraversal(root);

        System.out.println("Vertical Order Traversal:");
        for (List<Integer> col : result) {
            System.out.println(col);
        }
    }
}
