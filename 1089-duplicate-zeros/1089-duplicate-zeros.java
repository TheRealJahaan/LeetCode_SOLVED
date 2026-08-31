class Solution {
    public void duplicateZeros(int[] arr) {
        int lastidx = arr.length - 1 ;
        int possibleZeroDups = 0 ;

        for(int i = 0 ; i <= lastidx - possibleZeroDups ; i++){
            if(arr[i] == 0 ){
                // Edge Case 
                if(i == lastidx - possibleZeroDups){
                    arr[lastidx] = 0 ;
                    lastidx -= 1 ;
                    break;
                }
                possibleZeroDups++ ;
            }
        }
        int newlastidx = lastidx - possibleZeroDups ;

        for(int i = newlastidx ; i>= 0 ; i--){
            if(arr[i] == 0) {
                arr[i + possibleZeroDups] = 0 ;
                possibleZeroDups-- ;
                arr[i + possibleZeroDups] = 0 ;
            }
            else{
                arr[i + possibleZeroDups] = arr[i] ;
            }
        }

    }
}