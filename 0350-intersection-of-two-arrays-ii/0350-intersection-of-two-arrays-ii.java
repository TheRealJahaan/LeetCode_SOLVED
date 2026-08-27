class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // // is question me duplicate allowed he 
        // List<Integer> list = new ArrayList<>() ;
        // HashSet<Integer> set = new HashSet<>() ;

        // for(int i = 0 ; i < nums2.length ; i++){
        //     set.add(nums2[i]) ;
        // }

        // // yaha par set me nums2 ke elements aa gaye 

        // //ab nums1 ke elements tak jayenge and and check karege if already yes then add and list me nhi he to add

        // for(int i = 0 ; i < nums1.length ; i++){
        //     if(set.contains(nums1[i])){
        //         if(!list.contains(nums1[i])){
        //             list.add(nums1[i]) ;
        //         }
        //     }
        // }

        // int [] ans = new int [list.size()] ;
        // for(int i = 0 ; i < list.size() ; i++){
        //     ans[i] = list.get(i) ;
        // }

        // return ans ;
        // Using the nums2 ka frequency map

        HashMap<Integer , Integer> map = new HashMap<>() ;

        for(int num : nums1){
            map.put(num , map.getOrDefault(num , 0 ) + 1) ;
        }
        // ab yaha par mapping ho gaya he 
        // nums1 ka

        int res[] = new int[nums1.length] ;
        int k = 0 ;
        for(int num : nums2) {
            int count = map.getOrDefault(num , 0 ) ;

            if(count == 0 ){
                continue ;
            }
            else{
                res[k] = num ;
                k = k + 1 ;
                map.put(num , count - 1) ; 
            }

        }
        return Arrays.copyOfRange(res, 0 , k ) ;


    }
}