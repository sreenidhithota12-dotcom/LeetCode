class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int hash[] = new int[51];
        int maxi=0;
        for(int x : nums){
            hash[x]++;
            maxi=Math.max(maxi,x);
        }
        if(k==n) return maxi;
        maxi=0;
        if(k==1){
            for(int i=0;i<n;i++){
                if(hash[nums[i]]==1){
                    maxi=Math.max(maxi,nums[i]);
                }
            }
            if(maxi!=0)return maxi;
        }
        else{
            if(hash[nums[0]]==1 && nums[0]>nums[n-1]) return nums[0];
            if(hash[nums[n-1]]==1 && nums[0]<=nums[n-1]) return nums[n-1];
            if(hash[nums[0]]==1) return nums[0];
            if(hash[nums[n-1]]==1) return nums[n-1];
        }
        return -1;
    }
}