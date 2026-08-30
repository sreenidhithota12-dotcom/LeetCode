class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        int k=-1,j=-1;
        if(n==1) return 1;
        int maxi = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(nums[i]<mini){
                k=i;
                mini=nums[i];
            }
            if(nums[i]>maxi){
                j=i;
                maxi=nums[i];
            }
        }
        int left=Math.min(k,j);
        int right=Math.max(k,j);
        int w1=right+1;
        int w2=n-left;
        int w3= (left+1) + (n-right);
        w3=Math.min(w2,w3);
        return Math.min(w1,w3);
    }
}