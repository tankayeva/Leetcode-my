package string;

import string.Solution1662;

class Solution1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();


        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }

        if (sb1.equals(sb2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution1662 s = new Solution1662();
        String[] word1 = {"ab", "c"};

        String[] word2 = {"a", "bc"};


        System.out.println(s.arrayStringsAreEqual(word1, word2));
    }


}