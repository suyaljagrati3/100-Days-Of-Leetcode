import java.util.Arrays;

public class closestsum {
    public static void main(String[] args) {
        int[] arr = {1, 60, -10, 70, -80, 85};

        Arrays.sort(arr); //built in function

        int left = 0;
        int right = arr.length - 1;

        int minSum = Integer.MAX_VALUE;
        int first = 0;
        int second = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                first = arr[left];
                second = arr[right];
            }

            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                break;
            }
        }

        System.out.println("Pair: " + first + ", " + second);
        System.out.println("Sum: " + minSum);
    }
}