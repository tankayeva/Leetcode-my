package Sorting;

import java.util.ArrayList;
import java.util.List;

public class _912 {


    //quick sort
    class Solution1 {
        public List<Integer> sortArray(int[] nums) {
            List<Integer> res = new ArrayList<>();
            if (nums == null || nums.length == 0) return res;
            quickSort(nums, 0, nums.length - 1);
            for (int i : nums) res.add(i);
            return res;
        }

        private void quickSort(int[] nums, int l, int r) {
            if (l >= r) return;
            int mid = partition(nums, l, r);
            quickSort(nums, l, mid);
            quickSort(nums, mid + 1, r);
        }

        private int partition(int[] nums, int l, int r) {
            int pivot = nums[l];
            while (l < r) {
                while (l < r && nums[r] >= pivot) r--;
                nums[l] = nums[r];
                while (l < r && nums[l] <= pivot) l++;
                nums[r] = nums[l];
            }
            nums[l] = pivot;
            return l;
        }
    }


    //top-down merge sort
    class Solution2 {
        public List<Integer> sortArray(int[] nums) {
            List<Integer> res = new ArrayList<>();
            if (nums == null || nums.length == 0) return res;
            mergeSort(nums, 0, nums.length - 1);
            for (int i : nums) res.add(i);
            return res;
        }

        private void mergeSort(int[] nums, int l, int r) {
            if (l >= r) return;
            int mid = l + (r - l) / 2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);
            merge(nums, l, r);
        }

        private void merge(int[] nums, int l, int r) {
            int mid = l + (r - l) / 2;
            int[] tmp = new int[r - l + 1];
            int i = l, j = mid + 1, k = 0;
            while (i <= mid || j <= r) {
                if (i > mid || j <= r && nums[i] > nums[j]) {
                    tmp[k++] = nums[j++];
                } else {
                    tmp[k++] = nums[i++];
                }
            }
            System.arraycopy(tmp, 0, nums, l, r - l + 1);
        }
    }


    //bottom-up merge sort
    class Solution3 {
        public List<Integer> sortArray(int[] nums) {
            List<Integer> res = new ArrayList<>();
            if (nums == null || nums.length == 0) return res;
            mergeSort2(nums);
            for (int i : nums) res.add(i);
            return res;
        }

        private void mergeSort2(int[] nums) {
            for (int size = 1; size < nums.length; size *= 2) {
                for (int i = 0; i < nums.length - size; i += 2 * size) {
                    int mid = i + size - 1;
                    int end = Math.min(i + 2 * size - 1, nums.length - 1);
                    merge2(nums, i, mid, end);
                }
            }
        }

        private void merge2(int[] nums, int l, int mid, int r) {
            int[] tmp = new int[r - l + 1];
            int i = l, j = mid + 1, k = 0;
            while (i <= mid || j <= r) {
                if (i > mid || j <= r && nums[i] > nums[j]) {
                    tmp[k++] = nums[j++];
                } else {
                    tmp[k++] = nums[i++];
                }
            }
            System.arraycopy(tmp, 0, nums, l, r - l + 1);
        }
    }

    //heap sort
    class Solution4 {
        public List<Integer> sortArray(int[] nums) {
            List<Integer> res = new ArrayList<>();
            if (nums == null || nums.length == 0) return res;
            heapSort(nums);
            for (int i : nums) res.add(i);
            return res;
        }

        private void heapSort(int[] nums) {
            for (int i = nums.length / 2 - 1; i >= 0; i--) {
                heapify(nums, i, nums.length - 1);
            }
            for (int i = nums.length - 1; i >= 1; i--) {
                swap(nums, 0, i);
                heapify(nums, 0, i - 1);
            }
        }

        private void heapify(int[] nums, int i, int end) {
            while (i <= end) {
                int l = 2 * i + 1, r = 2 * i + 2;
                int maxIndex = i;
                if (l <= end && nums[l] > nums[maxIndex]) maxIndex = l;
                if (r <= end && nums[r] > nums[maxIndex]) maxIndex = r;
                if (maxIndex == i) break;
                swap(nums, i, maxIndex);
                i = maxIndex;
            }
        }

        private void swap(int[] nums, int i, int j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}
