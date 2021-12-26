package Tree;

import javax.swing.tree.TreeNode;

public class _101 {

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

        // Explanation https://www.youtube.com/watch?v=QMtUwj1-o1s
        public boolean isSymmetric(TreeNode root) {
            return isSymmetric(root, root);
        }

        private boolean isSymmetric(TreeNode root1, TreeNode root2) {
            if (root1 == null && root2 == null)
                return true;
            if (root1 == null || root2 == null)
                return false;


            return (root1.val == root2.val && isSymmetric(root1.left, root2.right)
                    && isSymmetric(root1.right, root2.left));
        }
    }
}
