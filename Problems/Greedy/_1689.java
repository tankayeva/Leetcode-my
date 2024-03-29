package Greedy;


/*
General explanation
if we have a number say 22 so how can we achieve this sum by adding only the numbers which have 1 and 0 as it's digits,
the answer should be:
11
+11
= 22
Now if we have 23 then ans should be 11+11+01
for 34 it should be 11+11+11+1
so if we have a number say 829 then we can write it as
111 // now remaining 1 for getting sum 8 = 7 , 2 is 1 and 9 is 8
111 // now remaining 1 for getting sum 8 = 6 , 2 is 0 and 9 is 7
101 // now remaining 1 for getting sum 8 = 5 , 2 is 0 and 9 is 6
101 // now remaining 1 for getting sum 8 = 4 , 2 is 0 and 9 is 5
101 // now remaining 1 for getting sum 8 = 3 , 2 is 0 and 9 is 4
101 // now remaining 1 for getting sum 8 = 2 , 2 is 0 and 9 is 3
101 // now remaining 1 for getting sum 8 = 1 , 2 is 0 and 9 is 2
101 // now remaining 1 for getting sum 8 = 0 , 2 is 0 and 9 is 1
001 // now remaining 1 for getting sum 8 = 0 , 2 is 0 and 9 is 0
so by observing the above example we understood that we have to add 1 until we do not get a sum equal to the max digit in the given number.
so the final answer will be the max digit in the given number.
*/

public class _1689 {

    static class Solution {
        public int minPartitions(String n) {
            int maximum = 0;
            for (int i = 0; i < n.length(); i++) {
                maximum = Math.max(maximum, n.charAt(i) - '0');
                System.out.println(n.charAt(i) - '0');
            }
            return maximum;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minPartitions("82734"));
    }
}
