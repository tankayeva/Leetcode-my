package arrays;

class _263 {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        int[] divisors = {2, 3, 5};

        for (int i : divisors) {
            while (n % i == 0) {
                n /= i;
            }
        }
        return n == 1;
    }


    public static void main(String[] args) {
        _263 s = new _263();
        System.out.println(s.isUgly(6));


    }
}