class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();                       
//                                                                       |
        // for(int i = 0; i < nums1.length; i++){                        | 
        //     for(int j = 0; j < nums2.length; j++){                    |
        //         if(!list.contains(nums1[i]) && nums1[i] == nums2[j]){ |
        //             list.add(nums1[i]);                               |
        //         }                                                     |
        //     }                                                         |
        // }                                                             |______ optimizing this code 
//                                                                       |       cuz it has high runtime 
        // int[] ans = new int[list.size()];                             |       according to me 
//                                                                       |
        // for(int i = 0; i < list.size(); i++){                         |
        //     ans[i] = list.get(i);                                     |
        // }                                                             |
                //                                                       |
        // return ans; 
        
        HashSet<Integer> set = new HashSet<>() ;
        
        for(int i = 0 ; i < nums2.length ; i++){
            set.add(nums2[i]) ;
        }                      

        for(int i = 0 ; i < nums1.length ; i++){
            if(set.contains(nums1[i])){
                if(!list.contains(nums1[i])){
                    list.add(nums1[i]) ;
                }
            }

        }

        int ans [] = new int[list.size()] ;

        for(int i = 0 ; i < list.size() ; i++){
            ans[i] = list.get(i) ;
        }

        return ans ;
    }
}