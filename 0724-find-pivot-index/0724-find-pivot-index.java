class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] ls=new int[n];
        int[] rs=new int[n];
        ls[0]=0;
        rs[n-1]=0;
        for(int i=n-2;i>=0;i--){
            rs[i]=rs[i+1]+nums[i+1];
        }
        if(ls[0]==rs[0]) return 0;
        for(int i=1;i<n;i++){
            ls[i]=ls[i-1]+nums[i-1];
            if(ls[i]==rs[i]) return i;
        }
        
        return -1;
    }
}