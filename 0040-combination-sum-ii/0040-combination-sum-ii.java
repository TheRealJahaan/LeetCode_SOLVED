class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates) ;
        List<List<Integer>> ans = new ArrayList<>() ;
        List<Integer> output = new ArrayList<>(); 
        int index = 0 ;

        solve(candidates , target , index , ans , output );
        return ans ;
    }
    static void solve(int candidates[] , int target , int index , List<List<Integer>> ans , List<Integer> output ){
        // BASE CASE 
        if(target == 0 ){
            ans.add(new ArrayList(output)) ;
            return ;
        }
        if(target  < 0 ){
            return ;
        }
        if(index >= candidates.length ){
            return ;
        } 


        // Processing
        // Include ka ANs
        output.add(candidates[index]) ;
        // Recurssion
        solve(candidates ,target - candidates[index] , index + 1 , ans , output);

        // Backtrack 
        output.remove(output.size() - 1) ;
        // Exclude 
        while(index + 1 < candidates.length && candidates[index] == candidates[index+ 1]){
            index++ ;
        }
        solve(candidates , target , index+ 1 , ans , output ) ;
    }
}