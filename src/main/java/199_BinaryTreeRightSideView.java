/*
 * https://leetcode.com/problems/binary-tree-right-side-view/description/
 * */

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        TreeNode node;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                node = queue.poll();

                if (node != null) {
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }

                    if (i == size - 1) {
                        result.add(node.val);
                    }
                }
            }
        }

        return result;
    }

    public List<Integer> rightSideViewRec(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(root, result, 0);
        return result;
    }

    private void dfs(TreeNode root, List<Integer> result, int level) {
        if (root == null) {
            return;
        }
        if (level == result.size()) {
            result.add(root.val);
        }

        dfs(root.right, result, level + 1);
        dfs(root.left, result, level + 1);
    }

}
