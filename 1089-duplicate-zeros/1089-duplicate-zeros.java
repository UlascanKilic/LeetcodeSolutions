class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0 && i != arr.length-1){
                //shift
                for (int j = arr.length-2; j > i; j--){
                    arr[j+1] = arr[j];
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
}