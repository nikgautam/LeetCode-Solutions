class Solution {
    public int search(int[] nums, int target) {
        
        int si=0, ei=nums.length-1;
        int mid;
        
        while(si<=ei){
            mid = (si+ei)/2;
            
            if(nums[mid] == target) return mid;
            
            //If left sorted    
            if( nums[si] <= nums[mid]  ){
                if(nums[si]<=target && target<=nums[mid])
                    ei = mid-1;
                else
                    si = mid+1;
                
            }else{
                if( nums[mid] <= target && target <= nums[ei] )
                    si = mid+1;
                else
                    ei = mid-1;
            }
            
        }
        return -1;
    }
    
}