class Solution {
    public int compress(char[] chars) {
        int readIndex = 0 ; // ye chars[] ke liye
        int writeIndex = 0 ; //ye compressed string ke liye

        while(readIndex < chars.length ){
            char currentChar = chars[readIndex] ;
            int count = 0 ;

            while(readIndex < chars.length && currentChar == chars[readIndex]){
                readIndex++ ;
                count++ ;
            }
            chars[writeIndex] = currentChar ;
            writeIndex++ ;
            // Now inserting the count ;
            if(count > 1) {
                String countStr = String.valueOf(count) ;
                for(char digit : countStr.toCharArray()){
                    chars[writeIndex] = digit ;
                    writeIndex++ ;
                }
            }

        }
        // return the length of compressed String
        return writeIndex;
    }
}