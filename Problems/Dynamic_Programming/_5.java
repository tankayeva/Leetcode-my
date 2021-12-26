package Dynamic_Programming;

//https://www.youtube.com/watch?v=b4vgaENSRrY

public class _5 {
    static class Solution {
        public String longestPalindrome(String s) {

            char[] ca = s.toCharArray();
            int rs = 0, re = 0;
            int max = 0;
            for (int i = 0; i < ca.length; i++) {
                if (isPalindrome(ca, i - max - 1, i)) {
                    System.out.println();
                    rs = i - max - 1;
                    re = i;
                    System.out.println("rs1: " + rs);
                    max += 2;
                    System.out.println("max1: " + max);
                } else if (isPalindrome(ca, i - max, i)) {
                    rs = i - max;
                    re = i;
                    System.out.println("rs: " + rs);
                    max += 1;
                    System.out.println("max: " + max);
                }
            }
            return s.substring(rs, re + 1);
        }

        private boolean isPalindrome(char[] ca, int s, int e) {
            if (s < 0) return false;

            while (s < e) {
                System.out.println("ca[s++]: " + ca[s++]);
                System.out.println("ca[e--]: " + ca[e--]);
                if (ca[s++] != ca[e--]) return false;
            }
            return true;
        }
    }


    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.longestPalindrome("babad"));

    }
}
