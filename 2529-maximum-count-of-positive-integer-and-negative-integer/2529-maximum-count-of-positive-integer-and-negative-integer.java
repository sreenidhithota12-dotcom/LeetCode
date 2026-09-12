class Solution {
    public int maximumCount(int[] nums) {
        int c1=0,c2=0;
        for(int x : nums){
            if(x==0) continue;
            if(x>0) c1++;
            else c2++;
        }
        return Math.max(c1,c2);
    }
}