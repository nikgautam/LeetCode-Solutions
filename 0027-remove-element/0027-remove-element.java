class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i: nums){
            if(i==val)
                count++;
        }
        
        int i=0, j=nums.length-1;
        
        while( i<=j ){
            if(nums[i] == val && nums[j] != val){
                int swap = nums[i];
                nums[i] = nums[j];
                nums[j] = swap;
                i++;
                j--;
            }else if(nums[i] != val && nums[j] != val )
                i++;
            else if( nums[i] == val && nums[j] == val )
                j--;
            else
            {
                i++;
                j--;
            }
            
        }
        
        return nums.length-count;
    }
}