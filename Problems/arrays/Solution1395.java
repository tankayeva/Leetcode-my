package arrays;

class Solution1395 {
    public int numTeams(int[] arr) {


        /*
       Since N = 200, brute force is pretty fine for this problem.
But not sure if interviewer is expecting the same. So, optimizing to O(N^2) is pretty easy once we can see the tripplets:

We need to count tripplets {arr[i] < arr[j] < arr[k]} and {arr[i] > arr[j] > arr[k]} where i<j<k.
So, let's find for every j count of all i and k, so that it will follow either of above 2 conditons and summarize the counts:

Example: [13, 3, 4, 10, 7, 8]
13:

for {arr[i] < arr[j] < arr[k]} tripplets, Nothing smaller from left side.
for {arr[i] > arr[j] > arr[k]} tripplets, Nothing larger from left side.
3:

for {arr[i] < arr[j] < arr[k]} tripplets, Nothing smaller from left side.
for {arr[i] > arr[j] > arr[k]} tripplets, Nothing smaller from right side.
4:

for {arr[i] < arr[j] < arr[k]} tripplets,1 number is smaller and 3 are larger, total = 1*3 = 3 tripplets => {3, 4, 10}, {3, 4, 7}, {3, 4, 8}
for {arr[i] > arr[j] > arr[k]} tripplets, Nothing smaller from right side.
10:

for {arr[i] < arr[j] < arr[k]} tripplets,Nothing larger from right side.
for {arr[i] > arr[j] > arr[k]} tripplets, 1 number is bigger and 2 numbers are smaller, total = 1*2 = 2 tripplets => {13, 10, 7}, {13, 10, 8}
7:

for {arr[i] < arr[j] < arr[k]} tripplets, 2 numbers are smaller and 1 is larger, total = 2*1 = 2 => {3, 7, 8}, {4, 7, 8}
for {arr[i] > arr[j] > arr[k]} tripplets, Nothing smaller from right side.
8:

for {arr[i] < arr[j] < arr[k]} tripplets, Nothing larger from right side.
for {arr[i] > arr[j] > arr[k]} tripplets, Nothing smaller from right side.
Total = 3 + 2 + 2 = 7 tripplets.

Time complexity: O(N^2)
Space: O(1)  */


        int count = 0;
        int len = arr.length;
        for (int j = 0; j < len; j++) {
            int leftSmaller = 0, rightLarger = 0;
            int leftLarger = 0, rightSmaller = 0;
            for (int i = 0; i < j; i++) {
                if (arr[i] < arr[j]) {
                    leftSmaller++;
                } else if (arr[i] > arr[j]) {
                    leftLarger++;
                }
            }
            for (int k = j + 1; k < len; k++) {
                if (arr[j] < arr[k]) {
                    rightLarger++;
                } else if (arr[j] > arr[k]) {
                    rightSmaller++;
                }
            }
            count += leftSmaller * rightLarger + leftLarger * rightSmaller;
        }

        return count;

    }
}