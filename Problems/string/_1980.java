package string;

// https://leetcode.com/problems/find-unique-binary-string/discuss/1418687/Detailed-Explanation-O(N)-Java-C%2B%2B-Python-short-concise-code-Cantor's-Diagonalization
public class _1980 {

    static class Solution {
        public String findDifferentBinaryString(String[] nums) {

  /*      HashSet<String> set = new HashSet<>();
		for (String num : nums) {
			set.add(num);
		}
		for (int i = 0;; i++) {
			if (!set.contains(Integer.toBinaryString(1 << nums.length | i).substring(1))) {
				return Integer.toBinaryString(1 << nums.length | i).substring(1);
    }
} */

            String ans = "";
            for (int i = 0; i < nums.length; i++) {
                System.out.println("nums[i]: " + nums[i]);
                System.out.println("nums[i].charAt(i): " + nums[i].charAt(i));
                ans += nums[i].charAt(i) == '0' ? '1' : '0';              // Using ternary operator

            }

            // ans+=Integer.toString(1-(nums[i].charAt(i)-'0'));    // Alternate:  or use toString & 1-x to flip
            return ans;
        }


    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] nums = {"01", "10"};
        System.out.println(s.findDifferentBinaryString(nums));

    }
}



