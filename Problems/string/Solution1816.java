package string;

public class Solution1816 {
    public String truncateSentence(String s, int k) {

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                k--;
                if (k <= 0)
                    return sb.toString();


            }
            sb.append(c);

        }


        return sb.toString();
    }


    public static void main(String[] args) {

        Solution1816 s = new Solution1816();

        System.out.println(s.truncateSentence("Hello how are you Contestant", 4));
    }
}
