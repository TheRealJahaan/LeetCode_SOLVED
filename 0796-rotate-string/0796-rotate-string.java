class Solution {
    public boolean rotateString(String s, String goal) {
        // IS question me NO use of loops 
        // i will concatenate the string by itself and then check whether the concatenate has that String or not ..

        // Check the main thing that whether the s and the goal string has the same lenght 

        if(s.length() != goal.length()){
            return false ;
        }

        String concatenate = s + s ;

        if(concatenate.contains(goal)){
            return true ;
        }

        return false;
    }
}