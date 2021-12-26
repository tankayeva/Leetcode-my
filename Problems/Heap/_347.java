package Heap;

import java.util.*;

public class _347 {

    class Solution {
        public int[] topKFrequent(int[] nums, int k) {


            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            Queue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
            for (int key : map.keySet()) {
                heap.add(key);
            }

            int[] d = new int[k];

            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                //ans.add(heap.poll());
                d[i] = heap.poll();
            }

            return d;
        }
    }
}
