package string;

import java.util.HashSet;
import java.util.Set;

class Solution824 {
    private static Set<Character> vowels =
            new HashSet<>() {
                {
                    add('a');
                    add('e');
                    add('i');
                    add('o');
                    add('u');
                    add('A');
                    add('E');
                    add('I');
                    add('O');
                    add('U');
                }
            };

    public String toGoatLatin(String S) {
        String suff = "";
        StringBuilder sb = new StringBuilder();

        for (String tok : S.split(" ")) {
            suff += 'a'; // Java compiler converts this into a temporary StringBuilder

            if (!vowels.contains(tok.charAt(0))) {
                tok = tok.substring(1) + tok.charAt(0);
            }

            sb.append(tok).append("ma").append(suff).append(' ');
        }

        sb.deleteCharAt(sb.length() - 1); // remove extra space
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution824 s = new Solution824();

        System.out.println(s.toGoatLatin("I speak Goat Latin"));
    }
}
