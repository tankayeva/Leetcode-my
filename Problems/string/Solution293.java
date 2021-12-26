package string;

import java.util.ArrayList;
import java.util.List;

class Solution293 {
    public List<String> generatePossibleNextMoves(String s) {

        List<String> list = new ArrayList<String>();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '+' && s.charAt(i - 1) == '+') {
                list.add(s.substring(0, i - 1) + "--" + s.substring(i + 1));
            }
        }
        return list;


    }


   /*
        List<String> res = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            StringBuilder sb = new StringBuilder(s);
            if (s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
                sb.replace(i, i + 2, "--");
                res.add(sb.toString());
            }
        }
        return res;
 */
}