class Solution {
    public String breakPalindrome(String palindrome) {
        
        int n=palindrome.length();
        if(n==1) return "";
        char arr[]=palindrome.toCharArray();
        char ch='a';
        boolean done=false;
        for(int i=0;i<n;i++) {
            if(n%2==1 && i==n/2) continue;
            if(ch!=arr[i]) {
                arr[i]=ch;
                done=true;
                break;
            }
        }
        if(!done) {
            arr[n-1]=++ch;
        }
        return String.valueOf(arr);
        
    }
}