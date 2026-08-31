class Solution {
    public void rotate(int[][] arr) {
        // First taking the Transpose of the Matrix 
        int n = arr.length ;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                int temp = arr[i][j] ;
                arr[i][j] = arr[j][i] ;
                arr[j][i] = temp ;
            }
        }

        // Ye transpose ho gaya Ba karna he reverse 

         for(int i = 0 ; i < n ; i++){
            int left = 0 ;
            int right = n - 1 ;

            while(left < right){
                int temp = arr[i][left] ;
                arr[i][left] = arr[i][right] ;
                arr[i][right] = temp ;
                left++ ;
                right-- ;
            } 
        } 
    }
}