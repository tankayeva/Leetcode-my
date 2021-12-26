package Greedy;


public class _1689 {

    static class Solution {
        public int minPartitions(String n) {
            int maximum = 0;
            for (int i = 0; i < n.length(); i++) {
                maximum = Math.max(maximum, n.charAt(i) - '0');
                System.out.println(n.charAt(i) - '0');
            }
            return maximum;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minPartitions("82734"));
    }
}
