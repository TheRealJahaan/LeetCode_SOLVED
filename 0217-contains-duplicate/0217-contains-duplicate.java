class Solution {
    public boolean containsDuplicate(int[] arr) {
        int n = arr.length ;
        Arrays.sort(arr) ;

        // for(int i = 0 ; i < n ; i++){          |
        //     for(int j = i + 1 ; j < n ; j++){  |
        //         if(arr[i] == arr[j]){          |
        //             return true ;              |------------> time limit exceeded
        //         }.                             | 
        //     }                                  | 
        // }                                      |
        // return false ;
        
        // Trying to write a newly optimized code 
        // with O(n) T.C
        // 1.) Arrays to sort to kar hi diya h to ek test case lete he
        // {1,1,1,2,2,3,3,3,4,4,4,4} ;

        for(int i = 0 ; i < n - 1; i++){
            if(arr[i] == arr[i + 1]){
            return true ;
                
            }

        }
        return false ;

    }
}