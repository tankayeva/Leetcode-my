package arrays;

import java.util.ArrayList;
import java.util.List;

public class _2149 {

    class Solution {
        public int[] rearrangeArray(int[] nums) {

            List<Integer> pos = new ArrayList<>(), neg = new ArrayList<>();

            for (int i: nums){
                if (i<0){
                    neg.add(i);
                } else{
                    pos.add(i);
                }
            }

            int [] res = new int[nums.length];

            for (int i=0; i<pos.size(); i++){
                res[i * 2] = pos.get(i);
                res[i * 2 + 1] = neg.get(i);
            }

            return res;
        }
    }
}
