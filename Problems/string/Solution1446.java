package string;

class Solution1446 {
    public int maxPower(String s) {

        int n = s.length(), ans = 0, count = 1;

        for (int i = 0; i < n; ++i) {
            if (i == n - 1 || s.charAt(i) != s.charAt(i + 1)) {
                ans = Math.max(ans, count);
                count = 1;
            } else {
                count++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution1446 s = new Solution1446();

        System.out.println(s.maxPower("abbcccddddeeeeedcba"));
    }
}