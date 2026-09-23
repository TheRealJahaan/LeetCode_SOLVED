class Solution {
    public int reversing_number(int number){
        int rev = 0;
        while(number != 0){
            int digit = number% 10 ;
            rev = rev * 10 + digit;
            number = number/10 ;

        }
        return rev ;
    }
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false ;
        }
        if(x == reversing_number(x)){
            return true ;
        }
        else{
            return false ;
        }
    }
}