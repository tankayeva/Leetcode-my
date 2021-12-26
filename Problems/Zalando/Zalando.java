package Zalando;

/*
You are given a string consisting of digits.
Find biggest two that is a consistent fragment of the given string.
For example, two-digit consistent fragments of "50552" are ["50" "55", "52"), representing the numbers (50, 5, 55, 52).
The biggest among them is 55.

Examples: 1. Given S="50552", your function should return 55.
 2. Given S="10101", your function should return 10.
 3. Given S="88", your function should return 88.
 */
public class Zalando {


    public int Solution(String S) {
        // write your code in Java SE 8

        if (S.length() == 0 || S.isEmpty())
            return 0;

        int[] arr = new int[S.length()];
        int cnt = 0;

        for (int i = 1; i < S.length(); i++) {
            char s1 = S.charAt(i - 1);
            char s2 = S.charAt(i);

            String sv = s1 + "" + s2;

            int res = Integer.parseInt(sv);

            arr[cnt] = res;
            cnt++;
        }
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }


    public static void main(String args[]) {
        Zalando s = new Zalando();


        System.out.println(s.Solution(""));


    }


}
