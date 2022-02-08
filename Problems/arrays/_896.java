package arrays;

class _896 {
    public boolean isMonotonic(int[] A) {
        return increasing(A) || decreasing(A);
    }

    //  boolean ans = true;
    public boolean increasing(int[] A) {
        for (int i = 1; i < A.length; i++)
            if (A[i] > A[i - 1])
                return false;
        return true;
    }

    public boolean decreasing(int[] A) {
        for (int i = 1; i < A.length; i++)
            if (A[i] < A[i - 1])
                return false;
        return true;
    }

}