package string;

class Solution1332 {
    public int removePalindromeSub(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        String reversed = new StringBuilder(s).reverse().toString();
        if (reversed.equals(s)) {
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) {
        Solution1332 s = new Solution1332();


        System.out.println(s.removePalindromeSub("ababa"));
    }
}
