class Solution {
   public List<Integer> findDisappearedNumbers(int arr[]){
        List<Integer> list = new ArrayList<>();
        int i =0 ;
        while(i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for(int index = 0 ; index < arr.length ; index++){

            if(arr[index] != index + 1) {
                list.add(index + 1) ;
            }
        }
        return list;
    }
    static void swap(int arr[]  , int first, int second){
        int temp = arr[first] ;
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }
}