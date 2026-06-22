class Solution {
    public List<Integer> findDuplicates(int arr[]){
        List<Integer> list = new ArrayList<>() ;
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
            if(arr[index] != index+ 1 ){
               list.add(arr[index]) ;
            }
        }
        return list;

    }

    static void swap(int arr[] , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }
}