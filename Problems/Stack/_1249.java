package Stack;

public class _1249 {
    // Explanation https://www.youtube.com/watch?v=sClFsx12VgM
    class Solution {
        public String minRemoveToMakeValid(String s) {

            char[] ch = s.toCharArray();
            int cnt = 0;

            //left to right
            //) ---> (
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '(') {
                    cnt++;
                } else if (ch[i] == ')') {
                    if (cnt > 0) {
                        cnt--;
                    } else {
                        ch[i] = 0;
                    }

                }
            }


            // right to left
            //( ---> )
            cnt = 0;
            for (int i = ch.length - 1; i >= 0; i--) {
                if (ch[i] == ')') {
                    cnt++;
                } else if (ch[i] == '(') {
                    if (cnt > 0) {
                        cnt--;
                    } else {
                        ch[i] = 0;
                    }

                }
            }

            StringBuilder sb = new StringBuilder();

            for (char c : ch) {
                if (c != 0) {
                    sb.append(c);
                }
            }

            return sb.toString();
        }
    }
}
