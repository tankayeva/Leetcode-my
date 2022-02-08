package string;

public class _2126 {

/*
-We iterate over the string s twice.
-Count of variable brackets is maintained using tot
-Count of fixed open brackets is maintained using op
-Count of fixed closed brackets is maintained using cl
-In forward iteration we are checking if we have too many fixed closed brackets ), this is achieved using: if tot + op - cl < 0: return False
-In backward iteration we are checking if we have too many fixed open brackets (, this is achieved using: if tot - op + cl < 0: return False
*/

    class Solution {
        public boolean canBeValid(String s, String l) {
            if (s.length() % 2 == 1) return false;
            int total = 0, open = 0, closed = 0;
            for(int i = s.length() - 1; i >= 0; i--) {
                if (l.charAt(i) == '0')
                    total += 1;
                else if (s.charAt(i) == '(')
                    open += 1;
                else if (s.charAt(i) == ')')
                    closed += 1;
                if (total - open + closed < 0) return false;
            }
            total = open = closed = 0;
            for(int i = 0; i < s.length(); i++) {
                if (l.charAt(i) == '0')
                    total += 1;
                else if (s.charAt(i) == '(')
                    open += 1;
                else if (s.charAt(i) == ')')
                    closed += 1;
                if (total + open - closed < 0) return false;
            }
            return true;
        }
    }
}
