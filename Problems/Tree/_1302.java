package Tree;

import java.util.Queue;
import java.util.*;

public class _1302 {


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
        public int deepestLeavesSum(TreeNode root) {
            Queue<TreeNode> q = new LinkedList();

            q.offer(root);

            int sum = 0;
            while (q.size() > 0) {
                sum = 0;
                for (int i = q.size(); i > 0; i--) {
                    root = q.poll();

                    sum += root.val;
                    if (root.left != null)
                        q.offer(root.left);

                    if (root.right != null)
                        q.offer(root.right);

                }

            }
            return sum;
        }
    }
}
