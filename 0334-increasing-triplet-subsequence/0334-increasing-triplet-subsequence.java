class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n<3)
            return false;
        
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        
        for( int i: nums ){
            if(i<first)
                first = i;
            else if( first < i && i < second )
                second = i;
            else if( i > second )
                return true;
        }
        
        return false;
            
            
    }
}