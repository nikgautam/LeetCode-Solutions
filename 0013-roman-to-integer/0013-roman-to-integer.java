class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        if(s.length() == 1){
            return map.get(s.charAt(0));
        }
        int n = s.length();
        
        //char prev = s.charAt(n-1), curr = s.charAt(n-2);
        int ans = map.get(s.charAt(n-1));
        for( int i=n-2; i>=0; i-- ){
            int prev = map.get(s.charAt(i+1));
            int curr = map.get(s.charAt(i));
            if( curr >= prev )
                ans += curr;
            else
                ans -= curr;
            
        }
        
        return ans;
        
        
    }
}