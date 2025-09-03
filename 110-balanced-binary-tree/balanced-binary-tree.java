//                     Worst Code with TC --> O(n^2)
// class Solution {
//     public int levels(TreeNode root){
//         if(root==null) return 0;
//         return 1 + Math.max(levels(root.left),levels(root.right));
//     }
//     public boolean isBalanced(TreeNode root) {
//         if(root==null) return true;
//         int diff = Math.abs(levels(root.left)-levels(root.right));
//         if(diff>1) return false;
//         boolean lst = isBalanced(root.left);
//         if(lst==false) return false;
//         boolean rst = isBalanced(root.right);
//         if(rst==false) return false;
//         return true;
//     }
// }


 //Method 2--> Optimal Code
  
 class Solution{
    static boolean ans;
    public int levels(TreeNode root){
        if(root==null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        int diff = Math.abs(leftLevels - rightLevels);
        if(diff>1) ans = false;
        return 1 + Math.max(leftLevels,rightLevels);
    }
    public boolean isBalanced(TreeNode root){
        ans = true;
        levels(root); // TC = O(n)
        return ans;
    }
 } 
