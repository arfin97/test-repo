import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int temp = 0;
        for(int i = 0; i < nums.length-1; i+=2) {
            temp = nums[i] + nums[i+1];
            temp = temp/2;
            System.out.println(temp);
            if(temp != nums[i+1]) {
                return nums[i];
            }
        }
        return -1;
    }
}