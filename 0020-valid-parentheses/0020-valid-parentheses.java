class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>() ;

        for(char ch : s.toCharArray()){
            // agar open bracker he to push kardo 
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch) ;
            }
            else{
                // agar closing bracket he to check karo ki uska open bracket peek par he 
                // agar yes to use pop kardo 
                // agar no to return false 
                // IMP POInt -> peek karne se pehele check karo ki kahi empty to nhi 
                if(st.isEmpty()){
                    return false ; // kyuki in closing bracket ka opening bracket available nhi he 
                }
                else if(ch == ')' && st.peek() != '(') {
                    return false ;
                }
                else if(ch == ']' && st.peek() != '[') {
                    return false ;
                }
                else if(ch == '}' && st.peek() != '{') {
                    return false ;
                }
                else{
                    st.pop() ;
                }
            }
        }
        if(st.isEmpty()){
            return true ;
        }
        else{
            return false ;
        }


    }
}