package Greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _1282 {

    static class Solution1 {
        public List<List<Integer>> groupThePeople(int[] arr) {

            int n = arr.length;
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            List<List<Integer>> ans = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int curr = arr[i];
                List<Integer> temp = new ArrayList<>();
                if (map.containsKey(curr))
                    temp = map.get(curr);
                System.out.println(map.get(curr));
                System.out.println("-------------------1");
                temp.add(i);
                System.out.println(temp);
                System.out.println("-------------------2");
                map.put(curr, temp);
                System.out.println(map);
                System.out.println("-------------------3");
                if (temp.size() == curr) {
                    ans.add(temp);
                    map.remove(curr);
                }
            }

            return ans;
        }


    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] arr = {3, 3, 3, 3, 3, 1, 3};
        System.out.println(s.groupThePeople(arr));
    }
}
