class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
 int retval = 0, temp = 1;
        for(int i = 0; i< nums.length; i++){
            if(i < nums.length-1){
                if(nums[i] == 1 ){
                    if(nums[i] == nums[i+1]){
                        temp++;
                    }
                    if(temp > retval)
                        retval = temp;
                }
                else {
                    temp = 1;
                }
            }
            else{
                if(nums[i] == 1)
                    temp = 1;
                else
                    temp = 0;
                if(temp > retval)
                    retval = temp;
            }

        }
        return retval;
    }
}