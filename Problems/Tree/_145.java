package Tree;
//Binary Tree Postorder Traversal DFS

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class _145 {

    //Definition for a binary tree node.
    public class TreeNode {
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

    class Solution {

        public void postorderTraversal(TreeNode root, List<Integer> answer) {
            if (root == null) {
                return;
            }

            postorderTraversal(root.left, answer);   // traverse left subtree
            postorderTraversal(root.right, answer);  // traverse right subtree
            answer.add(root.val);                   // visit the root
        }

        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> answer = new ArrayList<>();
            postorderTraversal(root, answer);
            return answer;
        }
    }
}
