import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
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

class Tuple {
    TreeNode node;
    int row;
    int col;

    Tuple(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}

public class solution {

    // This is like using the level order traversal

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0, 0));
        while (!q.isEmpty()) {
            Tuple t = q.poll();
            TreeNode node = t.node;
            int x = t.row;
            int y = t.col;

            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }

            map.get(x).get(y).offer(node.val);

            if (node.left != null) {
                q.offer(new Tuple(node.left, x - 1, y + 1));
            }
            if (node.right != null) {
                q.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }

        System.out.println("Top View:");
        for (Integer x : map.keySet()) {
            TreeMap<Integer, PriorityQueue<Integer>> yMap = map.get(x);
            int topValue = yMap.get(yMap.firstKey()).peek(); // topmost value for this
            // vertical line
            System.out.println(topValue);

        }

        System.out.println("Bottom View:");
        for (Integer x : map.keySet()) {
            TreeMap<Integer, PriorityQueue<Integer>> yMap = map.get(x);
            int topValue = yMap.get(yMap.lastKey()).peek(); // topmost value for this
            // vertical line
            System.out.println(topValue);

        }

        List<List<Integer>> list = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            list.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {

                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        // Create a sample binary tree:
        // 3
        // / \
        // 9 20
        // / \
        // 15 7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        List<List<Integer>> result = verticalTraversal(root);

        System.out.println("Vertical Traversal Output:");
        for (List<Integer> column : result) {
            System.out.println(column);
        }
    }
}

// Why TreeMap? It keeps keys in sorted order, which helps you get left-to-right
// (x) and top-to-bottom (y) traversal.

// Why PriorityQueue? If multiple nodes share the same (x, y), their values
// should be sorted numerically.
