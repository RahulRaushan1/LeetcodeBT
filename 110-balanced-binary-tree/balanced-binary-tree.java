class Solution {
    // comment
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int diff = Math.abs(levels(root.left)-levels(root.right));
        if(diff>1) return false;
        boolean lst = isBalanced(root.left);
        if(lst==false) return false;
        boolean rst = isBalanced(root.right);
        if(rst==false) return false;
        return true;
    }
}