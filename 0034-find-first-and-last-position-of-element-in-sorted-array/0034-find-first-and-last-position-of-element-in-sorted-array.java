class Solution{
    public int [] searchRange(int arr[] , int target) {
        int first = first_search(arr, target);
        int last = second_search(arr, target);

        int[] ans;
        if (first > last) {
            ans = new int[]{-1, -1};
        } else {
            ans = new int[]{first, last};
        }

        return ans;
        
    }

    public int first_search(int arr[] , int target){
        int start = 0 ; 
        int end = arr.length - 1;

        while(start <= end){
            int mid = start+ (end - start)/2 ;



            if(arr[mid] >= target){
                // move left
                end = mid - 1;
            }
            else{
                //move right 
                start = mid+ 1 ;
            }
        }
        return start ;
    }


    public int second_search(int arr[] , int target){
        int start = 0 ; 
        int end = arr.length - 1;
        while(start <= end){
            int mid = start+ (end - start)/2 ;

            if(arr[mid] <= target){
                //move right 
                start = mid + 1;
            }
            else{
                //move left
                end = mid - 1;
            }
        }
        return end ;
    }
}
