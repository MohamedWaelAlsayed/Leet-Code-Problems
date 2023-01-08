import java.util.Arrays;

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
       return nums;
    }
}
class Main{
    public static void main(String[] args) {
Solution my_Solution = new Solution();
int[] nums = {1,2,3,4,5};
my_Solution.runningSum(nums);
System.out.println(Arrays.toString(nums));
    }
}
