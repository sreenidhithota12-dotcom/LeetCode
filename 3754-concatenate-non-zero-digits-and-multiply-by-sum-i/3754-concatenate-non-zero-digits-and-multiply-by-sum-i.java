class Solution {
    public long sumAndMultiply(int n) {
        int i = 1;
        int temp = n;
        long ans=0;
        long sum=0;
        while(n>0){
            long rem = n %10;
            if (rem != 0){
                ans= ans + rem * i;
                i = i * 10;
            }
            sum+= rem;
            n/=10;
        } 
        return ans * sum;
    }
}