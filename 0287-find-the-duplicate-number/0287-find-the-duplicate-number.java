class Solution {

    static int findDuplicate(int arr[]){
        int i = 0 ;
        int ans = -1 ;
        while(i <arr.length ){
            int index = arr[i]-1 ;
            if(arr[i] != arr[index]){
                swap(arr , i , index) ;
            }
            else{
                i++ ;
            }
        }

        for(int index = 0 ; index <arr.length ; index++){
            if(arr[index] != index + 1){
               ans = arr[index] ;
            }
        }
        return ans;


    }

    static void swap(int arr[] , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }
}