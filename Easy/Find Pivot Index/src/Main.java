class Solution {
    public int pivotIndex(int[] nums) {
        int left_sum = 0;
        int s = 0;
        for (int x : nums) s += x;
        for (int i = 0; i < nums.length; i++) {
            if (left_sum == s - left_sum - nums[i]) return i;
            left_sum += nums[i];
        }

        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution my_solution = new Solution();
        System.out.println(my_solution.pivotIndex(new int[]{2, 1, -1}));
    }
    }
