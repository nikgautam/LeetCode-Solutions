import java.util.Arrays;
class Solution {
    public int largestPerimeter(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=n-1; i>=2; i--){
            
            int a = nums[i];
            int b = nums[i-1];
            int c = nums[i-2];
            if( a < b + c )
                return a+b+c;
        }
        
        return 0;
        
    }
    
    public boolean isTrianglePossible(int a, int b, int c){
        
        if( a < b + c )
            return true;
        
        return false;
        
    }
}