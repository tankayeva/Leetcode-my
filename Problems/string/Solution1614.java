package string;

public class Solution1614 {

    public int maxDepth(String s) {
        int count = 0;   //count current dept of "()"
        int max = 0;     //count max dept of "()"

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
            }
            max = Math.max(count, max);
        }
        return max;

    }

    public static void main(String[] args) {
        Solution1614 s = new Solution1614();
        System.out.println(s.maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}
