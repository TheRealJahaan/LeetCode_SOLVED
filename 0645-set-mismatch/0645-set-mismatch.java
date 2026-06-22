class Solution {
    static int [] findErrorNums(int arr[]){

        int [] ans = new int [2] ;
        int i = 0 ;
        while(i < arr.length ) {
            int correct = arr[i] - 1 ;
            if(arr[i] != arr[correct]){
                swap(arr , i , correct) ;

            }
            else{
                i++;
            }
        }

        for(int indx = 0 ; indx < arr.length  ; indx++){
            int index = arr[indx] - 1;
            if(arr[indx] != indx + 1) {
                ans[0] = arr[indx] ;
                ans[1] = indx + 1;
            }

        }
        return ans;
    }
    static void swap(int arr[] , int first , int second) {
        int temp = arr[first];
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }
}
