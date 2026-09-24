class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int n = nums.length;
        int l=0;
        int h=0;
        int an=Integer.MAX_VALUE;
        while(h<n){
            
                sum+=nums[h];
                h++;
            
            while(sum>=target) {
                an=Math.min(an,h-l);
                sum-=nums[l];
                l++;
            }
        }
        return an == Integer.MAX_VALUE ? 0 : an;
    }
}