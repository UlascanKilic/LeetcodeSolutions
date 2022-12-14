class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0, leftsum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            if(totalSum - leftsum - nums[i] == leftsum)
                return i;
            leftsum += nums[i];
        }
        return -1;
    }
}