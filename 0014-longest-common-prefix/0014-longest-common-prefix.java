class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String ans = "";
        for( int j=0; j<200; j++ ){
            boolean match = true;
            for( int i=0; i<strs.length; i++ ){
                if( j >= strs[i].length() ){
                    match = false;
                    break;
                }
                
                if( strs[0].charAt(j) != strs[i].charAt(j) ){
                    match = false;
                    break;
                }
                
            }
            
            if( match )
                ans = ans + strs[0].charAt(j);
            else
                break;
            
        }
        
        return ans;
    }
}