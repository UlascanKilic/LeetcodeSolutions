class Solution {
    public int[] sortedSquares(int[] nums) {
         //square
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)Math.pow(nums[i], 2);
            System.out.println(nums[i]);
        }
        return Arrays.stream(nums).sorted().toArray();
    }
}