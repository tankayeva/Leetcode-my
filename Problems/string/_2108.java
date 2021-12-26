package string;

public class _2108 {

    boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; ++i, --j)
            if (s.charAt(i) != s.charAt(j))
                return false;
        return true;
    }

    public String firstPalindrome(String[] words) {
        for (String word : words)
            if (isPalindrome(word))
                return word;
        return "";
    }
}

