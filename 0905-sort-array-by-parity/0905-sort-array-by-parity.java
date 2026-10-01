class Solution {
    public int[] sortArrayByParity(int[] arr) {
        // Method --1 
        int n = arr.length ;
        int yes [] = new int[n] ;
        int index = 0 ;

        int i = 0 ;
        while(i < n ){
            if(arr[i] % 2 == 0 ) {
                yes[index] = arr[i] ;
                index++ ;
            }
            i++;

        }
        i = 0 ;
        while(i  < n ){
            if(arr[i] % 2 == 1) {
                yes[index] = arr[i] ;
                index++ ;
            }
            i++;
        }
        return yes ;
    }

}