package arrays;

import arrays.Solution1748;

import java.util.HashMap;
import java.util.Map;

class Solution1748 {
    public int sumOfUnique(int[] nums) {

        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);

        for (HashMap.Entry<Integer, Integer> e : map.entrySet())
            if (e.getValue() == 1)
                sum += e.getKey();

        return sum;
    }

    public static void main(String[] args) {
        Solution1748 s = new Solution1748();
        int[] nums = {1, 2, 3, 2};
        System.out.println(s.sumOfUnique(nums));
    }
}

/*
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                sum += num;
            }
        }
        return sum;
    }*/
