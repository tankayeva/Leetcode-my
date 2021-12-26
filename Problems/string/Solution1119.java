package string;
//https://leetcode.com/problems/remove-vowels-from-a-string/

class Solution1119 {

    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();

        //Appr.1
        for (char c : s.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sb.append(c);
            }
        }

        //Appr.2
        /*
        for(int i = 0; i < S.length(); i++){
            if(!isVowel(S.charAt(i))){
                sb.append(S.charAt(i));
            }
        }
        */
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1119 s = new Solution1119();
        // s.removeVowels("leetcodeisacommunityforcoders");
        System.out.println(s.removeVowels("leetcodeisacommunityforcoders"));
    }
}
