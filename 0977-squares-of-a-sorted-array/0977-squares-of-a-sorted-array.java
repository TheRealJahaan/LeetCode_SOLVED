class Solution {
    public int[] sortedSquares(int[] arr) {

        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i] = arr[i] * arr[i] ;
        // }

        // Arrays.sort(arr) ;
        // return arr;

        // ____________OPTIMIZED APPROACH______________

        int n = arr.length ;
        int l = 0 ;
        int r = n - 1 ;
        int result [] = new int[n] ;

        for(int i = n - 1 ; i>= 0 ; i--){
            int val ;
            if(Math.abs(arr[l]) > Math.abs(arr[r])){
                val  = arr[l] ;
                l++ ;
            }
            else{
                val = arr[r] ;
                r-- ;
            }
            result[i] = val * val ;
        }
        return result ;
    }
}