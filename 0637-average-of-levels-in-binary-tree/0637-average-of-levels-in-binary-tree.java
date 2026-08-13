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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> sol = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root== null) return new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
                int num = q.size();
                //List<Integer> li = new ArrayList<>();
                Double sum=0.0;
                //int c=0;
                for(int i=0;i<num;i++){
                    TreeNode x = q.poll();
                   // li.add(x.val);
                    sum+=x.val;
                    //c++;
                    if(x.left != null) q.add(x.left);
                    if(x.right != null) q.add(x.right);
                    
                }
                sol.add(sum/num);
        }
    
        return sol;
    }
}