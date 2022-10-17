class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int n = sentence.length();
        if(n<26)
            return false;
        
        boolean visited[] = new boolean[26];
        
        for(int i=0; i<n; i++)
            visited[ sentence.charAt(i) - 'a' ] = true;
        
        for(boolean bool: visited)
            if( !bool )
                return false;
        
        return true;
        
    }
}