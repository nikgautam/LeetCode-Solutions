import java.util.*;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            List<Integer> ans = new ArrayList<>();
            return ans;
        }
        
        List<Integer> ans = inorderTraversal(root.left);
        ans.add(root.val);
        List<Integer> right = inorderTraversal(root.right);
        ans.addAll(right);
        return ans;
    }
}