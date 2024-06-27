package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q46SortColursTwoPointer {

    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};

        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int i = 0;

        while (i <= right) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
    }
}
