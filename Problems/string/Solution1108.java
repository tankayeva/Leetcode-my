package string;

//https://leetcode.com/problems/defanging-an-ip-address/

class Solution1108 {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (char c: address.toCharArray()){
            if (c=='.'){
                sb.append("[.]");
            } else {
                sb.append(c);
            }


        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1108 s = new Solution1108();
        System.out.println(s.defangIPaddr("255.100.50.0"));
    }

}