class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        
        String temp = countAndSay(n-1);
        String ans = "";
        for( int i=0; i<temp.length(); i++ ){
            int count=1;
            while( i+1 < temp.length() && temp.charAt(i) == temp.charAt(i+1) ){
                count++;
                i++;
            }
            
            ans = ans + String.valueOf(count) + temp.charAt(i);            
        }
        
        return ans;
    }
}