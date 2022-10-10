class Solution {
    
    String[] keys = { "","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
    public List<String> letterCombinations(String digits) {
        
        if( digits.length() == 0 ){
            List<String> ans = new ArrayList<>();
            //ans.add("");
            return ans;
        }
        
        if( digits.length() == 1 ){
            List<String> ans = new ArrayList<>();
            
            for( int i=0; i<keys[digits.charAt(0)-48].length(); i++ )
                ans.add( "" + keys[digits.charAt(0)-48].charAt(i) );
            
            return ans;
        }
        
        List<String> tempAns = letterCombinations( digits.substring(1) );
        List<String> ans = new ArrayList<>();
        
        int keySize = keys[ digits.charAt(0) - 48 ].length();
        //int k = 0;
        
        for( int i=0; i<keySize; i++ ){
            
            for( int j=0; j<tempAns.size(); j++ ){
                ans.add( keys[ digits.charAt(0) - 48 ].charAt(i) + tempAns.get(j) );
            }
            
        }
        
        return ans;
        
    }
}