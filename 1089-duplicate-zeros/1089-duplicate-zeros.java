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

        // int [] dest = new int [arr.length];

        // int s = 0 ;
        // int d = 0 ;

        // while ( s< arr.length ){
        //     if(arr[s] == 0 ){
        //         if(d < arr.length ){
        //             dest[d] = 0 ;   
        //         }
        //         d = d +1 ;
        //         if(d < arr.length ){
        //             dest[d] = 0;
        //         }

        //     }
        //     else{
        //         if(d < arr.length){
        //             dest[d] = arr[s] ;
        //         }
        //     }
        //     d = d+ 1 ;
        //     s = s+ 1 ;
        // }

        // for(int i = 0 ; i< arr.length ; i++){
        //     arr[i] = dest[i] ;
        // }

        // The correct method to approsch this solutuion 

        int lastidx = arr.length - 1 ;
        int zerodup = 0 ;

        for(int i = 0 ; i <= lastidx - zerodup ; i++){
            if(arr[i] == 0 ){
                if(i == lastidx - zerodup){
                    arr[lastidx] = 0 ;
                    lastidx = lastidx - 1 ;
                    break;
                }
                zerodup++ ;
            }
        }
        // ab yaha tak mere paas ye scene he ki agar last index me zero hua to bhi last index me 0 sotre ho jayega and then if not then zero jitne he utne ko lastindex se minus to ho hi raha he 
        int newLastindex = lastidx - zerodup ;
        for(int i = newLastindex ; i >= 0 ; i--){
            if(arr[i] == 0) {
                arr[i + zerodup] = 0 ;
                zerodup-- ;
                arr[i + zerodup] = 0 ;
            }
            else{
                arr[i + zerodup] = arr[i] ;
            }
        }
    }
}