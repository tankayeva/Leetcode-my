package string;

import java.util.ArrayList;

public class _151 {

    static class Solution {
        public String reverseWords(String s) {
            s = s.trim();
            StringBuilder sb = new StringBuilder();

            ArrayList<String> list = new ArrayList<>();

            for (String ss : s.split(" ")) {
                list.add(ss);
            }
            System.out.println(list);

            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i).length() == 0)
                    continue;
                sb.append(list.get(i) + " ");
            }

            sb.deleteCharAt(sb.length() - 1);

            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.reverseWords("a good   example"));
        System.out.println(s.reverseWords("  hello world  "));
    }
}
