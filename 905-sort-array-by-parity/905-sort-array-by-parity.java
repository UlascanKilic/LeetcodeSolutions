class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ballSize = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 1) ballSize++;
            else{
                int temp = nums[i - ballSize];
                nums[i - ballSize] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}