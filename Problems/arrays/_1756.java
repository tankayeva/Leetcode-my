package arrays;

public class _1756 {

    class MRUQueue {

        int[] arr;

        public MRUQueue(int n) {
            arr = new int[n + 1];

            arr[0] = -1;

            for (int i = 1; i <= n; i++) {
                arr[i] = i;
            }
        }

        public int fetch(int k) {
            int res = arr[k];
            int size = arr.length - 1;

            int i = k;

            while (i < size) {
                arr[i] = arr[i + 1];
                i++;
            }

            arr[size] = res;
            return res;
        }
    }

/**
 * Your MRUQueue object will be instantiated and called as such:
 * MRUQueue obj = new MRUQueue(n);
 * int param_1 = obj.fetch(k);
 */
}
