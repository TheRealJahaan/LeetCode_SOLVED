class Solution {
    public void rotate(int[][] arr) {
        
        int rowlength = arr.length ;
        int collength = arr[0].length ;

        for(int i = 0 ; i < rowlength ; i++){
            for(int j = i + 1 ; j < collength ; j++){
                // Taking transpose of a matrix 
                int temp = arr[i][j] ;
                arr[i][j] = arr[j][i] ;
                arr[j][i] = temp ;
            }
        }
// AND NOW REVERSING THE ELEMENTS 
        for(int i = 0 ; i < rowlength ; i++){
            int left = 0 ;
            int right = arr.length - 1;

            while( left < right ){
                int temp = arr[i][left] ;
                arr[i][left] = arr[i][right] ;
                arr[i][right] = temp;

                left++ ;
                right-- ;
            }
        }
    }
}