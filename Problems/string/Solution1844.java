package string;


class Solution1844 {
    public String replaceDigits(String s) {


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if ((i & 1) == 0) sb.append(s.charAt(i));
            else {
                char ch = (char) (s.charAt(i - 1) + (s.charAt(i) - '0'));
                System.out.println(s.charAt(i));
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1844 s = new Solution1844();
        System.out.println(s.replaceDigits("a1b2c3d4e"));
    }

}