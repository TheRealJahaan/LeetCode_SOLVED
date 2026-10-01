class Solution {
    public int heightChecker(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>() ;
        int sorted[] = new int [arr.length] ;
        for(int i = 0 ; i < arr.length ;i++){
            sorted[i] = arr[i] ;
        }
        Arrays.sort(sorted) ;
        // aba sorted me to sorted arr aa gaya he 
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == sorted[i] ){
                continue ;
        }
            else{
                list.add(i) ;
            }
        }

        return list.size() ;
    }
}