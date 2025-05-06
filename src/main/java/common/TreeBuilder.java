package common;

import java.util.ArrayDeque;
import java.util.Deque;

public class TreeBuilder {
    /**
     * Builds a binary tree from an array of values, where null represents a missing node.
     * Example: [1, 2, 3, null, 4] builds the tree:
     *       1
     *      / \
     *     2   3
     *      \
     *       4
     */
    public static TreeNode buildTree(Integer[] values) {
        if (values == null || values.length == 0 || values[0] == null) return null;

        TreeNode root = new TreeNode(values[0]);
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        int index = 1;
        while (!queue.isEmpty() && index < values.length) {
            TreeNode current = queue.poll();

            if (values[index] != null) {
                current.left = new TreeNode(values[index]);
                queue.offer(current.left);
            }
            index++;

            if (index < values.length && values[index] != null) {
                current.right = new TreeNode(values[index]);
                queue.offer(current.right);
            }
            index++;
        }

        return root;
    }
}
