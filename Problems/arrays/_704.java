package arrays;

public class _704 {


    //Binary Search Best Explanation https://www.hackerearth.com/practice/algorithms/searching/binary-search/tutorial/
    class Solution1 {
        public int search(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (nums[mid] > target) {
                    high = mid - 1;
                } else if
                (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    return mid;
                }


            }
            return -1;

//Brute Force
    /*    int res=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==target){
                return i;
            }
        }


        return -1; */
        }
    }

    //Brute Force
    class Solution2 {
        public int search(int[] nums, int target) {

            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }
    }
}
