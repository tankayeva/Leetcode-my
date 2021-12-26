package string;

import java.util.HashMap;
import java.util.Map;

class Solution1859 {
    public String sortSentence(String s) {

        String[] str = s.split(" ");
        Map<Integer, String> m = new HashMap<Integer, String>();
        int i = 0;
        for (String st : str) {
            i = (int) (st.charAt(st.length() - 1) - '0');
            String s1 = st.substring(0, st.length() - 1);
            m.put(i, s1);
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 1; j <= str.length; j++) {
            sb.append(m.get(j) + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
