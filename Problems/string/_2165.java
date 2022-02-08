package string;

import java.util.Arrays;

public class _2165 {

    class Solution {
        public long smallestNumber(long num) {
            boolean neg = false;
            if(num < 0) //Remove negative sign
            {
                neg = true;
                num = -num;
            }
            char[] dig = String.valueOf(num).toCharArray();
            Arrays.sort(dig); // Ascending sort
            if(!neg) // For positive number, swap the first non zero with 0th index if 0 is present
            {
                int i = 0;
                for(i = 0; i < dig.length; i++)//Finding the first non zero
                    if(dig[i] != '0')
                        break;
                if(i <= dig.length-1)//Swapping
                {
                    char temp = dig[i];
                    dig[i] = dig[0];
                    dig[0] = temp;
                }
            }
            long ret = 0L;
            if(neg)//Requires descending sort, hence reverse traversal
            {
                StringBuilder sb = new StringBuilder();
                for(int i = dig.length-1; i >= 0; i--)
                    sb.append(dig[i]);
                ret = Long.parseLong(sb.toString());
                ret = -ret;
            }
            else
                for(char c : dig)
                    ret = ret * 10 + (c - '0');
            return ret;
        }
    }
}
