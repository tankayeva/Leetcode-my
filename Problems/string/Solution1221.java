package string;

public class Solution1221 {

    public int balancedStringSplit(String s) {
        int res = 0, cnt = 0;
        for (int i = 0; i < s.length(); ++i) {
            cnt += s.charAt(i) == 'L' ? 1 : -1;
            if (cnt == 0) ++res;
        }
        return res;
    }

        public static void main(String[] args) {
            Solution1221 s = new Solution1221();
            System.out.println(s.balancedStringSplit("RLRRLLRLRL"));
        }
    }
