class Solution {
    public int maxProduct(int n1) {
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        
        while(n1>0){
            int n =n1%10;
            if(n>=m1){
                m2=m1;
                m1=n;
            }
            if(n<m1 && n>m2) m2=n;
            n1/=10;
        }
        return m1*m2;
    }
}