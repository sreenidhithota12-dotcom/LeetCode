class Solution {
    public int minMoves(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int ans=0;
        for(int x: nums) {
        maxi=Math.max(maxi,x);
        ans+=x;
        }
        
       
        return nums.length*maxi - ans;
    }
}