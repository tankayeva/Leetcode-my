package Tree;
//Binary Tree Preorder Traversal DFS

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _144 {


    // Definition for a binary tree node.
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

    //Recursion
    class Solution1 {
        private void preorderTraversal(TreeNode root, List<Integer> answer) {
            if (root == null) {
                return;
            }
            answer.add(root.val);                   // visit the root
            preorderTraversal(root.left, answer);   // traverse left subtree
            preorderTraversal(root.right, answer);  // traverse right subtree
        }

        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> answer = new ArrayList<>();
            preorderTraversal(root, answer);
            return answer;
        }

    }

    //Iteration
    class Solution2 {
        public List<Integer> preorderTraversal(TreeNode root) {
            LinkedList<TreeNode> stack = new LinkedList<>();
            LinkedList<Integer> output = new LinkedList<>();
            if (root == null) {
                return output;
            }

            stack.add(root);
            while (!stack.isEmpty()) {
                TreeNode node = stack.pollLast();
                output.add(node.val);
                if (node.right != null) {
                    stack.add(node.right);
                }
                if (node.left != null) {
                    stack.add(node.left);
                }
            }
            return output;
        }
    }


}
