class Solution {
    public void duplicateZeros(int[] arr) {
        // int lastidx = arr.length - 1 ;
        // int possibleZeroDups = 0 ;

        // for(int i = 0 ; i <= lastidx - possibleZeroDups ; i++){
        //     if(arr[i] == 0 ){
        //         // Edge Case 
        //         if(i == lastidx - possibleZeroDups){
        //             arr[lastidx] = 0 ;
        //             lastidx -= 1 ;
        //             break;
        //         }
        //         possibleZeroDups++ ;
        //     }
        // }
        // int newlastidx = lastidx - possibleZeroDups ;

        // for(int i = newlastidx ; i>= 0 ; i--){
        //     if(arr[i] == 0) {
        //         arr[i + possibleZeroDups] = 0 ;
        //         possibleZeroDups-- ;
        //         arr[i + possibleZeroDups] = 0 ;
        //     }
        //     else{
        //         arr[i + possibleZeroDups] = arr[i] ;
        //     }
        // }


            // ITERATIVE METHOD 

        int [] dest = new int [arr.length];

        int s = 0 ;
        int d = 0 ;

        while ( s< arr.length ){
            if(arr[s] == 0 ){
                if(d < arr.length ){
                    dest[d] = 0 ;   
                }
                d = d +1 ;
                if(d < arr.length ){
                    dest[d] = 0;
                }

            }
            else{
                if(d < arr.length){
                    dest[d] = arr[s] ;
                }
            }
            d = d+ 1 ;
            s = s+ 1 ;
        }

        for(int i = 0 ; i< arr.length ; i++){
            arr[i] = dest[i] ;
        }
    }
}