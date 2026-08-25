class Solution {
    public void rotate(int[] arr, int k) {
        

        int n = arr.length;
        // while(k != 0) {                            ____|____
        //     int temp = arr[n - 1] ;                    |
//                                                        |
        //     // ab saare elemets ko aage badhana he     |
//                                                        |
        //     for(int i = n - 1 ; i > 0 ; i--){          |
        //         arr[i] = arr[i - 1] ;                  |------------------> ye time limit exceed karahe
//                                                        |
        //     }                                          |
        //     arr[0] = temp ;                            |
        //     k-- ;                                      |
        // }                                          ----|----


        // using reverse methods 
        // we have array      {1,2,3,4,5,6,7} 
        // now reverseing it  {7,6,5,4,3,2,1} 
        // k = 3 ; => 0->(k - 1) tak reverse ---> 5,6,7 |____ {5,6,7,1,2,3,4}
        // k = 3 ; => k->(n - 1) tak reverse --->1,2,3,4|         (ANS)
        if(k % n == 0 ){
            return ;
        }
        k = k % n ; 
        reverse(arr , 0 , n - 1 ) ;
        reverse(arr , 0 , k - 1 ) ;
        reverse(arr , k , n -1 ) ;


    }
    public void reverse(int arr[] ,int first , int second){
        while(first <= second){
        int temp = arr[first] ;
        arr[first] = arr[second] ;
        arr[second] = temp ;

        first = first + 1;
        second = second - 1 ;
        }
    }
}