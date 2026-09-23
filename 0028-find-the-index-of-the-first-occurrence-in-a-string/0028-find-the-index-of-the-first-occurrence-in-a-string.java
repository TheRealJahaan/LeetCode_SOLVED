class Solution {
    public int strStr(String haystack, String needle) {
        // boolean flag = false ;
        
        // if(haystack.contains(needle)){
        //     flag = true ;
        // }
        
        // if(flag){
        //     for(int i  = 0 ; i <= haystack.length() - needle.length() ; i++){
                
        //         if(haystack.substring(i , i + needle.length()).equals(needle)) {
        //             return i ;
        //         }

        //     }
        // }
        // return -1 ;


        // BEST SIMPLE SOLUTION 
        return haystack.indexOf(needle) ;
    }
}