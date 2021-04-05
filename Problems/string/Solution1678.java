package string;
//https://leetcode.com/problems/goal-parser-interpretation/
class Solution1678 {
    public String interpret(String command) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); ++i) {
            char c = command.charAt(i);
            if (c == 'G') {
                sb.append(c);
            }else if (c == '(' && command.charAt(i + 1) == ')') {
                sb.append("o");
                ++i;
            }else {
                sb.append("al");
                i += 3;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1678 s = new Solution1678();
        System.out.println(s.interpret("G()(al)"));
    }
}