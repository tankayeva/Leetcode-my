package arrays;

import java.util.ArrayList;
import java.util.List;

class Solution1122 {
    public int [] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int[] left = new int[arr1.length];
        int n = 0, k = arr1.length - 1;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    res[n] = arr1[j];
                    n++;
                }
            }
        }
      ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1.length; i++){
                if (arr1[i] != arr2[j]){
                    list.add(arr1[i]);
                }
            }
        }

        for (int i = 0; i< list.size() ; i++){
            res[n] = list.get(i);
        }

    return res;

    }

    public static void main(String[] args) {
        Solution1122 s = new Solution1122();

        int arr1[] = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int arr2[] = {2, 1, 4, 3, 9, 6};

        System.out.println(s.relativeSortArray(arr1, arr2));


    }
}