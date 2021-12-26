package arrays;

class Solution1491 {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            }

            if (salary[i] > max) {
                max = salary[i];
            }
        }

        double sum = 0;
        int cnt = 0;

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] != min && salary[i] != max) {
                cnt++;
                sum += salary[i];
            }
        }

        return sum / cnt;
    }

    public static void main(String[] args) {
        Solution1491 s = new Solution1491();
        int[] nums = {48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000, 4000, 54000, 67000, 6000, 1000, 11000};

        System.out.println(s.average(nums));
    }
}
