class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for( int i = 0; i<s.length(); i++ ){
            char ch = s.charAt(i);
            if( ch == ')' ){
                if( st.empty() )
                    return false;
                if( st.peek() != '(' )
                    return false;
                
                st.pop();
                
            }else if( ch == ']' ){
                if( st.empty() )
                    return false;
                if( st.peek() != '[' )
                    return false;
                
                st.pop();
                
            }else if( ch == '}' ){
                if( st.empty() )
                    return false;
                if( st.peek() != '{' )
                    return false;
                
                st.pop();
            }
            else
                st.push(ch);
            
        }
        
        if( st.empty() )
            return true;
        
        return false;
        
    }
}