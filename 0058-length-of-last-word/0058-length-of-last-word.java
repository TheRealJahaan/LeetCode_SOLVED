class Solution {
    public int lengthOfLastWord(String s) {
        int j = s.length() - 1;
        // __________________________
        // Extra Spaces remove 

        while( j >= 0 && s.charAt(j)== ' ') {
            j-- ;
        }

        // ____________________
        int count = 0 ;
        while(j >= 0 && s.charAt(j) != ' ' ) {
            count++ ;
            j-- ;
        }
       return count ;

        


    }
}