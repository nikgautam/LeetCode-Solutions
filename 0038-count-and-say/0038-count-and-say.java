class Solution {
    public String countAndSay(int n) {
        
        String temp = "1", ans = "1";
        int k=1;
        while(k<n){
            ans = "";
            for(int i=0; i<temp.length(); i++){
                int count=1;
                while(i+1<temp.length() && temp.charAt(i) == temp.charAt(i+1)){
                    count++;
                    i++;
                }
                
                ans = ans + String.valueOf(count) + temp.charAt(i);
            }
            temp = ans;
            
            k++;
        }
        
        return ans;
    }
}