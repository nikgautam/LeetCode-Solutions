import java.lang.Math;
class Solution {
    public int maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE, sum = 0;
        
        for( int i: arr ){
            sum += i;
            
            max = Math.max(max, sum);
            
            if(sum < 0)
                sum = 0;
            
        }
        
        return max;
        
    }
}