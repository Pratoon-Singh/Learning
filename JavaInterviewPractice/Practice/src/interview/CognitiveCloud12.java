package interview;

public class CognitiveCloud12 {
    // Given an array of integers , return the number of good pairs.
    /*
    Given an array of integers nums, return the number of good pairs.

    A pair (i, j) is called good if nums[i] == nums[j] and i < j.
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));

    }

    public static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] cnt = new int[101];
        for (int x : nums) {
            ans += cnt[x]++;
        }
        return ans;
    }
}
