class Solution {
    public String breakPalindrome(String palindrome) {
        
        for( int i=0; i<palindrome.length(); i++ ){
            
            if( palindrome.length()%2!=0 && i == palindrome.length()/2)
                continue;
            
            if( i == palindrome.length()-1 ){
                palindrome = palindrome.substring( 0, palindrome.length()-1 ) + (char)( palindrome.charAt(i) + 1 );
                return palindrome;
            }
            
            if( palindrome.charAt(i) != 'a' ){
                
                palindrome = palindrome.substring(0, i) + 'a' + palindrome.substring( i+1 );
                return palindrome;
                
            }
            
        }
        
        return "";
        
    }
}