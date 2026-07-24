class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        int index = 0 ;
        List<List<Integer>> ans = new ArrayList<>() ;
        List<Integer> output = new ArrayList<>() ;


        solve(arr , index , output , ans ) ;
        return ans;
    }

    static void solve(int arr[] , int index , List<Integer> output ,List<List<Integer>> ans){

        // Base Case 

        if(index >= arr.length){
            // Iska matlab ki hum last tak aa gaye he 
            ans.add(new ArrayList<>(output)) ;
            return ;
        }
        // Processing

        // Include

        int currentVal = arr[index] ; 
        output.add(currentVal) ;
        solve(arr , index + 1 ,output , ans) ;

        // BackTracking
        output.remove(output.size() - 1) ;

        // Exclude
        solve(arr , index + 1 , output , ans) ;




    }
}
