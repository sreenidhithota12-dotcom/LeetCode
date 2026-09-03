class Solution {
    public boolean uniformArray(int[] nums) {
        int n = nums.length;
        int min =Integer.MAX_VALUE;
        boolean evenArray=true;
        for(int x:nums){
            min=Math.min(min,x);
            if(x%2==1) evenArray=false;
        }
        return evenArray || min%2==1;
    }
}