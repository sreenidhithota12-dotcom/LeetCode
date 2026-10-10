/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int[] parent(TreeNode root,int t,int d,int p){
        if(root==null) return new int[] {-1,p,0};
        if(root.val==t) return new int[] {d,p,1};
        int pare = root.val;
        int sol[]=parent(root.left,t,d+1,root.val);
        if(sol[2]!=0){
            return sol;
        }
        return parent(root.right,t,d+1,root.val);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        int forX[] = parent(root,x,0,-1);
        int forY[] = parent(root,y,0,-1);
        return forX[0]==forY[0] && forX[1]!=forY[1];
    }
}