package Zalando;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Zalando1 {


    public int solution(String S) {
        int[] freq = new int[26];
        for (char c : S.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        int exp = freq[25];
        int res = 0;
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;
            if (freq[i] > exp) {
                res += freq[i] - exp;
            } else {
                exp = freq[i];
            }
            if (exp > 0) exp--; // Lowest exp is zero, cannot be negative
        }
        return res;
    }


    public static void main(String args[]) {
        Zalando1 s = new Zalando1();


        System.out.println(s.solution("ccaaffddecee"));
        System.out.println(s.solution("eeeeeeeee"));

    }
}
