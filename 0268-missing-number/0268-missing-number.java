class Solution{
    public int missingNumber(int arr[]){

        Arrays.sort(arr) ;
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