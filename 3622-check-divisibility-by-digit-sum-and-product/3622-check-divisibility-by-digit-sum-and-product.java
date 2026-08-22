class Solution {
    public boolean checkDivisibility(int n) {
        int t=n;
        int sum=0;
        int product=1;
        int total=0;
        while(n>0){
            int x=n%10;
            sum+=x;
            product*=x;
            total=sum+product;
            n/=10;
        }
        if((t % total) == 0)
            return true;
        else
            return false;
    }
}