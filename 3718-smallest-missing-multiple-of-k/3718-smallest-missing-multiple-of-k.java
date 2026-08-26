class Solution {
    public int missingMultiple(int[] nums, int k) {
        int mul=k;
        while(true){
            boolean found=false;
            for(int x:nums){
                if(x==mul){
                    found=true;
                    break;
                }
            }
            if(!found) break;
            mul+=k;
        }
        return mul;
    }
}