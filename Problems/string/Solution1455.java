package string;

public class Solution1455 {

    public int isPrefixOfWord(String sentence, String searchWord) {
        int index = 1;
        for (String s : sentence.split(" ")) {
            if (s.startsWith(searchWord)) {
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution1455 s = new Solution1455();
        String ss = "i love eating burger";
        for (String str : ss.split(" ")) {
            System.out.println(str);
        }

        System.out.println(s.isPrefixOfWord("i love eating burger", "burg"));
    }
}
