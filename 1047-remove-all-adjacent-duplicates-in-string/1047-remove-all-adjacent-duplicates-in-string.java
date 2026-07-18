class Solution {
    public String removeDuplicates(String s) {
        // using StringBuilder for solving it 
        StringBuilder ans = new StringBuilder() ;
//      ab hum 0 --> s.length tak jayenge aur character nikalaenge
        for(int i = 0 ; i <s.length() ; i++){
            char ch = s.charAt(i) ;
            // agar ans ka last digit equal hota he ch ke to delete marenge 
            if( ans.length() > 0 && ans.charAt(ans.length() - 1) == ch){
                ans.deleteCharAt(ans.length() - 1) ;
            }
            // varna ans me vo ch daal do 
            else{
                ans.append(ch) ;
            }
        }
        // aur fir StringBuilder ko String me convert kar denge
        return ans.toString(); 
    }
}