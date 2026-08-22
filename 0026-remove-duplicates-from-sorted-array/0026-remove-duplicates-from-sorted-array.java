class Solution {
    public int removeDuplicates(int[] arr) {

        if(arr.length == 0 ){
            return 0 ;
        }

        int k = 1 ;
        for(int j =1 ; j < arr.length ; j++){
            if(arr[j] != arr[j - 1] ){
                arr[k] = arr[j] ;
                k++;
            }
        }
        return k;
    }

}