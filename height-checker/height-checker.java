class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        int count = 0;
        Arrays.sort(expected);
        for(int i = 0; i < heights.length; i++){
            if(expected[i] != heights[i]) count++;
        }
            
        return count;
    }
}