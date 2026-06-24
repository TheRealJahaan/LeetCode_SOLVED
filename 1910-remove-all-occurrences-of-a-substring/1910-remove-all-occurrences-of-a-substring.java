class Solution {
    public String removeOccurrences(String s, String part) {
        
        while(s.contains(part)){
//          hum dekhenge ki ye part kaha  se shuru hoga 
            int index = s.indexOf(part) ;

            // ab jab pata chal gaya then ek nayi string me 0--> index + (index + part ki length)---> end tak add kar denge

            s = s.substring(0,index) + s.substring(index + part.length() , s.length()) ;

        }
        return s;
    }
}