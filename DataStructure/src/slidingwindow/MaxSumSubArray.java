package slidingwindow;

import java.util.Arrays;
import java.util.List;

public class MaxSumSubArray {

    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(4, 2, 1, 7, 8, 1, 2, 8, 1, 0);
        int windowSize = 3; // fixed window size
        int currenSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < input.size(); i++) {
            currenSum += input.get(i);
            if (i >= (windowSize - 1)) {
                maxSum = Math.max(maxSum, currenSum);
                currenSum -= input.get(i - (windowSize - 1));
            }
        }
        System.out.println(maxSum);

    }
}
