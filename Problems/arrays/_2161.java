package arrays;

import java.util.ArrayList;

public class _2161 {

    class Solution {
        public int[] pivotArray(int[] nums, int pivot) {

            int n = 0;
            ArrayList<Integer> less = new ArrayList<>();
            ArrayList<Integer> greater = new ArrayList<>();

            for (int num: nums){
                if (num>pivot){
                    greater.add(num);
                }
                if (num<pivot){
                    less.add(num);
                }
                if (num==pivot){
                    n++;
                }
            }

            int [] res = new int[nums.length];

            for (int i=0; i<less.size(); i++){
                res[i] = less.get(i);
            }

            int s = less.size();

            while (n>0){
                res[s] = pivot;
                s++;
                n--;
            }

            for (int i=0; i<greater.size(); ++i){
                res[s+i] = greater.get(i);
            }

            return res;
        }
    }

}
