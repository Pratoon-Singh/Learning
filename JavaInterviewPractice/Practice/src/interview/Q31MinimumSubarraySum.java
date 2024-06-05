package interview;

public class Q31MinimumSubarraySum {
    public static void main(String[] args) {
        int[] nums = {3, 7, 90, 20, 10, 50, 40};
        int k = 3;
        int minSum = findMinSubarraySum(nums, k);
        System.out.println("Minimum sum of a subarray of size " + k + " is: " + minSum);
    }

    private static int findMinSubarraySum(int[] nums, int k) {
        int n = nums.length;

        // Calculate the sum of the first k elements
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        int minSum = currentSum;

        // Slide the window and update the minimum sum
        for (int i = k; i < n; i++) {
            currentSum += nums[i] - nums[i - k];
            if (currentSum < minSum) {
                minSum = currentSum;
            }
        }

        return minSum;
    }
}
