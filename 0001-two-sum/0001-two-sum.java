class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        HashMap<Integer , Integer> map = new HashMap<>() ;

        // for(int i = 0 ; i < arr.length ; i++){

        //     int num = arr[i] ;
        //     int diff =  target - num; 

        //     if(mapping.containsKey(diff)){
        //         return new int[]{mapping.get(diff) , i};
        //     }

        //     mapping.put(num , i) ;
        // }
        // return new int [] {-1 , -1} ;

        // ____________ OR __________________________

        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i] , i ) ;
        }
        // mapping ho gayi he 

        for(int i = 0 ; i < arr.length ; i++){
            int diff = target - arr[i] ;

            if(map.containsKey(diff) && map.get(diff) != i) {
                return new int [] {map.get(diff) , i } ;
            }
        }
        return new int [] {-1,-1} ;

    }
}