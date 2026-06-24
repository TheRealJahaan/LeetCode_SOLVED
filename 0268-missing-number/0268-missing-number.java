class Solution{
    public int missingNumber(int arr[]){
        int i = 0 ;
        while(i < arr.length ){
            int index = arr[i];

            if( arr[i] < arr.length && arr[i] != arr[index]){
                swap(arr , i , index) ;
            }
            else{
                i++ ;
            }
        }

        for(int indx = 0 ; indx <arr.length ; indx++){
            
            if(arr[indx] != indx){
                return indx;
            }

        }
        return arr.length ;
    }
    static void swap(int arr[] , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    }
}