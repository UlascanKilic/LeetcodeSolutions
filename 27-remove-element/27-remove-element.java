class Solution {
    public int removeElement(int[] nums, int val) {
        int removedValue = -99, removeCounter = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                //remove
                nums[i] = removedValue;
                removeCounter++;

                //shift ?
                if(i+1 < nums.length && nums[i+1] != removedValue){
                    int currentIndex = i;
                    while(currentIndex < nums.length-1 && nums[currentIndex+1] != removedValue){
                        nums[currentIndex] += nums[currentIndex+1];
                        nums[currentIndex+1] = nums[currentIndex] - nums[currentIndex+1];
                        nums[currentIndex] = nums[currentIndex] - nums[currentIndex+1];
                        currentIndex++;
                    }
                    i--;
                }
            }
        }
        return  nums.length-removeCounter;
    }
}