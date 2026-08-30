class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length ; 
        // int i = 0 ; 
        // int j = 0 ;

        // while(i < n ){
        //     if(arr[i] == 0 ){
        //         i++ ;
        //     }
        //     else if(arr[i] > 0){
        //         arr[j] = arr[i] ;
        //         j++ ;
        //         i++;
        //     }

        // }
        // while(j < n ){
        //     arr[j] = 0 ;
        //     j++ ;
        // }

        // _________________________________________________
        // THE ABOVE CODE IS TIME LIMIT EXCEDDED

        int j = 0 ;
        for(int i = 0 ; i< n ;i++){
            if(arr[i] != 0 ){
                arr[j] = arr[i] ;
                j++ ;
            }
        }

        while( j < n ){
            arr[j] = 0 ;
            j++ ;
        }
    }
}