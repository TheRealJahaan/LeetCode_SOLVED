class Solution {
    public int fib(int n) {
        // using recurrsion in this question 
        // fib series = 0 1 1 2 3 5 8 13 - - - 
        // so we know f(n) = f(n - 1) + f(n - 1).

        // base condition->
        if(n == 0){
            return 0 ;

        }
        if(n == 1){
            return 1;
        }

        int ans = fib(n - 1) + fib(n - 2) ; 
        return ans ;
    }

}