package Tree;
//Binary Tree Inorder Traversal DFS

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _94 {

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

    // Recursion 1
    class Solution1 {
        public void inorderTraversal(TreeNode root, List<Integer> answer) {
            if (root == null) {
                return;
            }

            inorderTraversal(root.left, answer);   // traverse left subtree
            answer.add(root.val);                   // visit the root
            inorderTraversal(root.right, answer);  // traverse right subtree
        }

        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> answer = new ArrayList<>();
            inorderTraversal(root, answer);
            return answer;
        }
    }

    //Recursion 2
    class Solution2 {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            helper(root, res);
            return res;
        }

        public void helper(TreeNode root, List<Integer> res) {
            if (root != null) {
                if (root.left != null) {
                    helper(root.left, res);
                }
                res.add(root.val);
                if (root.right != null) {
                    helper(root.right, res);
                }
            }
        }
    }

    //Iterative Approach
    public class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode curr = root;
            while (curr != null || !stack.isEmpty()) {
                while (curr != null) {
                    stack.push(curr);
                    curr = curr.left;
                }
                curr = stack.pop();
                res.add(curr.val);
                curr = curr.right;
            }
            return res;
        }
    }
}
