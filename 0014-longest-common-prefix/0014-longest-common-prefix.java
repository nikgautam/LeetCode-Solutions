class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        //String ans = "";
        Arrays.sort(strs);
        
        int c = 0;
        String first = strs[0];
        String last = strs[ strs.length-1 ];
        
        while( c<first.length() && c<last.length() ){
            
            if( first.charAt(c) == last.charAt(c) )
                c++;
            else break;
            
        }
        
        return ( c==0 ) ? "" : first.substring(0,c);
        
//         for( int j=0; j<200; j++ ){
//             boolean match = true;
//             for( int i=0; i<strs.length; i++ ){
//                 if( j >= strs[i].length() ){
//                     match = false;
//                     break;
//                 }
                
//                 if( strs[0].charAt(j) != strs[i].charAt(j) ){
//                     match = false;
//                     break;
//                 }
                
//             }
            
//             if( match )
//                 ans = ans + strs[0].charAt(j);
//             else
//                 break;
            
//         }
        
        //return ans;
    }
}