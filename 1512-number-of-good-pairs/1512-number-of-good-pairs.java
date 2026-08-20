class Solution {
    public int numIdenticalPairs(int[] nums) {
        int hash[]=new int[101];
        for(int x:nums){
            hash[x]++;
        }
        int c=0;
        for(int x:nums){
            int n = hash[x];
            if(n!=0)c+=n * (n-1) /2;
            hash[x]=0;
        }
        return c;
    }
}