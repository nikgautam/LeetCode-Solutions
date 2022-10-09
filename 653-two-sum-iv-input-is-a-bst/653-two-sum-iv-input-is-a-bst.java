import java.util.ArrayList;
class Solution {
    public boolean findTarget(TreeNode root, int target) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        inOrder(root,arr);
        
        int i=0, j = arr.size()-1;
        while( i<j ){
            
            if( arr.get(i) + arr.get(j) == target )
                return true;
            
            else if( arr.get(i) + arr.get(j) < target )
                i++;
            
            else
                j--;
            
        }
        
        return false;
    }
    
    public void inOrder( TreeNode root, ArrayList<Integer> arr ){
        
        if( root==null )
            return;
        
        inOrder(root.left, arr);
        arr.add(root.val);
        inOrder(root.right, arr);
        
    }
    
}