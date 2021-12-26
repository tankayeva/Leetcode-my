package string;

class Solution1309 {
    public String freqAlphabets(String s) {


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i + 2) == '#') {

            }
        }

        StringBuilder sb = new StringBuilder();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (i + 2 < size && s.charAt(i + 2) == '#') {
                sb.append((char) ((Integer.parseInt(s.substring(i, i + 2)) - 1) + 'a'));
                i = i + 2;
            } else sb.append((char) ((Integer.parseInt(String.valueOf(s.charAt(i))) - 1) + 'a'));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1309 s = new Solution1309();


        System.out.println(s.freqAlphabets("10#11#12"));
    }
}

