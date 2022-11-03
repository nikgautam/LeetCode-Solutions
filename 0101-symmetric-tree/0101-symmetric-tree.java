class Solution {
    public boolean isSymmetric(TreeNode root) {
        
       return help(root.left, root.right);
    }
    
    public boolean help(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        if(left != null && right == null)
            return false;
        if(left == null && right != null)
            return false;
        
        if( left.val != right.val )
            return false;
        
        return help( left.left, right.right ) && help( left.right, right.left );
        
            
    }
    
}