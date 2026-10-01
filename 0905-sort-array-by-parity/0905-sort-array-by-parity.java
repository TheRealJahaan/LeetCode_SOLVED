class Solution {
    public int[] sortArrayByParity(int[] arr) {
        // Method --1 
        int n = arr.length ;
        // int yes [] = new int[n] ;
        // int index = 0 ;

        // int i = 0 ;
        // while(i < n ){
        //     if(arr[i] % 2 == 0 ) {
        //         yes[index] = arr[i] ;
        //         index++ ;
        //     }
        //     i++;

        // }
        // i = 0 ;
        // while(i  < n ){
        //     if(arr[i] % 2 == 1) {
        //         yes[index] = arr[i] ;
        //         index++ ;
        //     }
        //     i++;
        // }
        // return yes ;


        // Method - 2 
        // Integer res[] = new Integer[n] ;
        // for(int i = 0 ; i < n ; i++){
        //     res[i] = arr[i] ;
        // }

        // Arrays.sort(res , (val1 , val2) -> Integer.compare(val1 % 2 , val2 % 2)) ;

        // for(int i = 0 ; i < n ; i++){
        //     arr[i] = res[i] ;
        // }
        // return arr ;



        // MEthod 3 ;

        int i = 0 ; 
        int j = n - 1;

        while( i < j ) {
            int mod1 = arr[i] % 2 ;
            int mod2 = arr[j] % 2 ;

            if(mod1 == 1 && mod2 == 0 ){
                int temp = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;
            }

            if(mod1 == 0 ){
                i++;
            }
            if(mod2 == 1 ){
                j-- ;
            }


        }
        return arr ;
    }

}