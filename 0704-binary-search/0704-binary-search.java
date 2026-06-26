class Solution {
    static int solve(int arr[] , int target, int start , int end){
        if(start > end){
            return -1 ;
        }

        int mid = start+ (end - start)/2 ;

        if(arr[mid] > target){
            end= mid - 1;
        }
        else if(arr[mid] < target){
            start = mid + 1;
        }
        else{
            return mid ;
        }
        return solve(arr , target , start , end) ;
    }
    public int search(int[] arr, int target) {
        int start = 0 ;
        int end = arr.length - 1;
        
        int ans =solve(arr , target , start , end ) ;
        return ans;
        
    }
}