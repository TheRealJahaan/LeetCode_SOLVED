class Solution {
    public int removeElement(int[] arr, int val) {
        // Using 2 pointers which are starting from the index 0 only 
        int i = 0 ;

        for(int j = 0 ; j < arr.length ; j++ ){
            if(arr[j] != val ){
                arr[i] = arr[j] ;
                i++;
            }


        }
        return i ;
    }
}