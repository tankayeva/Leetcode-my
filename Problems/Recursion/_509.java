package Recursion;

import java.util.HashMap;

class _509 {
    public int fib(int N) {
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();


        if (cache.containsKey(N)) {
            return cache.get(N);
        }
        int result;
        if (N < 2) {
            result = N;
        } else {
            result = fib(N-1) + fib(N-2);
        }
        // keep the result in cache.
        cache.put(N, result);
        return result;
    }
}