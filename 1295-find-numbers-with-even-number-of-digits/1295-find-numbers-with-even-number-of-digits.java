class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            int digitCount = 0;
            while (nums[i] != 0){
                nums[i] = nums[i] / 10;
                digitCount++;
            }
            if(digitCount % 2 == 0)
                sum++;
        }
        return sum;
    }
}