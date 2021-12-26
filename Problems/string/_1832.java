package string;

import java.util.HashSet;
import java.util.Set;

public class _1832 {

    class Solution {
        public boolean checkIfPangram(String sentence) {
            Set<Character> s = new HashSet<>();
            for (int i = 0; i < sentence.length(); ++i)
                s.add(sentence.charAt(i));
            return s.size() == 26;
        }
    }
}
