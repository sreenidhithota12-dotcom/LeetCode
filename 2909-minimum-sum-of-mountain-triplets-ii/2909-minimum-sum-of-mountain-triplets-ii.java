class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        int ans=Integer.MAX_VALUE;
        pse[0]=Integer.MAX_VALUE;//pse[0]
        nse[n-1]=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            pse[i]=Math.min(pse[i-1],nums[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            nse[i]=Math.min(nse[i+1],nums[i+1]);
        }
        for(int i=1;i<n-1;i++){
            if(pse[i]<nums[i] && nums[i]>nse[i])
            ans=Math.min(ans,nums[i]+pse[i]+nse[i]);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}