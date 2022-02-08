package Recursion;

public class _779 {


//https://leetcode.com/problems/k-th-symbol-in-grammar/discuss/265892/Runtime-0ms-Java-solution-with-explanation

// https://leetcode.com/problems/k-th-symbol-in-grammar/discuss/365364/Java-easy-to-understand-recursion


//https://leetcode.com/problems/k-th-symbol-in-grammar/discuss/113710/Python-simple-solution-to-understand-with-explanations

/*
row 1: 0
row 2: 01
row 3: 0110
row 4: 01101001
*/


    // think of the problem like this
/*        0
      /       \
     0          1
   /   \      /    \
   0     1    1      0
 / \     / \   / \   / \
 0  1   1   0  1  0  0  1
*/

    class Solution1 {
        public int kthGrammar(int N, int K) {
            return kth(K - 1);
        }

        public int kth(int K){
            if(K == 0)      return 0;
            if(K % 2 == 0)  return kth(K / 2);
            else            return reverse(kth(K / 2));
        }

        private int reverse(int val){
            return val == 0 ? 1 : 0;
        }
    }

    class Solution2 {
        public int kthGrammar(int N, int K) {
            if(N==1) return 0;
            if(K%2==0){
                if (kthGrammar(N-1,K/2)==0) return 1;
                else return 0;
            }
            else{
                if(kthGrammar(N-1,(K+1)/2)==0) return 0;
                else return 1;
            }
        }
    }
        }
