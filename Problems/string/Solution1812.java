package string;


// https://leetcode.com/problems/determine-color-of-a-chessboard-square/
public class Solution1812 {

    public boolean squareIsWhite(String c) {
        return (c.charAt(0) - 'a' + c.charAt(1) - '0' ) % 2 == 0;
    }

    public static void main(String[] args) {
        Solution1812 s = new Solution1812();
        System.out.println(s.squareIsWhite("a1"));

        String str = "abcdf";
        int n = str.charAt(1) - 'a';
        System.out.println(n);
    }
}