class Solution {
    public boolean uniformArray(int[] nums) {
        int n = nums.length;
        int min_odd =Integer.MAX_VALUE;;
        for(int x:nums){
            if(x%2==1)  min_odd=Math.min(min_odd,x);
        }
        int i=0;
        for(i=0;i<n;i++){
            if(nums[i]%2==1) continue;
            if(nums[i]-min_odd < 1) break;
        }
        if(i==n) return true;

        for(i=0;i<n;i++){
            if(nums[i]%2==0) continue;
            if(nums[i]-min_odd < 1) break;
        }
        if(i==n) return true;
        return false;
    }
}