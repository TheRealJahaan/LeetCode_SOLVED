class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int n = arr.length ;
        int count = 0 ;
        int i = 0 ;
        int sum = 0 ;
        while(i < n){
            if(arr[i] == 1) {
                count++ ;
            }
            if(arr[i] == 0 || i == n - 1) {
                if(sum < count){
                    sum = count ;
                    
                }
                count = 0 ;
            }
            i++;
        }
        return sum ;

    }
}