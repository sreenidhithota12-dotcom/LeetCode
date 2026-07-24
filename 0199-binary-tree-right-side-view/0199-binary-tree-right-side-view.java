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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root== null) return new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
                int num = q.size();
                for(int i=0;i<num;i++){
                    TreeNode x = q.poll();
                    if(x.left != null) q.add(x.left);
                    if(x.right != null) q.add(x.right);
                    if(i == num-1) li.add(x.val);
                }   
        }
    
        return li;
    }
}