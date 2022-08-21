class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0, biggest = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > biggest) {
                biggest = nums[i];
                maxIndex = i;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(i != maxIndex && nums[i] * 2 > biggest) return -1;
        }
        return maxIndex;
    }
}