class Solution {
    public int findNumbers(int[] nums) {
        int count = 0 ;
        for(int i : nums){
            if(even(i)) {
                count++;
            }
        }
        return count ;
    }
    int digits(int num){
        return (int)(Math.log10(num) + 1 );
    }
    boolean even(int num){
        if(digits(num) % 2 == 0){
            return true ;
        }
        else{
            return false ;
        }

    }
}