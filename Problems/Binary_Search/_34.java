package Binary_Search;

public class _34 {

    class Solution {
        public int[] searchRange(int[] nums, int target) {

            int[] result = new int[2];
            result[0] = findFirst(nums, target);
            result[1] = findLast(nums, target);
            return result;
        }

        private int findFirst(int[] nums, int target) {
            int idx = -1;
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums[mid] >= target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                if (nums[mid] == target) idx = mid;
            }
            return idx;
        }

        private int findLast(int[] nums, int target) {
            int idx = -1;
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums[mid] <= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                if (nums[mid] == target) idx = mid;
            }
            return idx;
        }

        /*
    ArrayList<Integer> list = new ArrayList<>();
       int [] res = {-1,-1};



      for (int i=0; i<nums.length; i++){

          if (nums[i]==target){
             list.add(i);
              break;
          }

      }

         for (int i=nums.length-1; i>=0; i--){
          if (nums[i]==target){
              list.add(i);
              break;
          }
      }

        int [] arr = new int[list.size()];

        for (int i=0; i<list.size(); i++){
            arr[i] = list.get(i);
        }

        if (arr.length==0 || nums.length==0)
          return res;
        else return arr; */
    }

}
