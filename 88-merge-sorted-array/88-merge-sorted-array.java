class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
                int secondNumPointer = 0;

        for(int i = m; i < n+m;i++){
            if(nums1[i] == 0 && secondNumPointer <= n-1){
                nums1[i] = nums2[secondNumPointer];
                int j = i;
                while(j-1 >= 0 && nums1[j] < nums1[j-1]){
                    nums1[j] += nums1[j-1];
                    nums1[j-1] = nums1[j] - nums1[j-1];
                    nums1[j] -= nums1[j-1];
                    j--;
                }
                secondNumPointer++;
            }
        }
    }
}