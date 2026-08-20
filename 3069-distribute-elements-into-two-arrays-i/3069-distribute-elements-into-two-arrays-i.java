class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] ans1=new int[n];
        int k=0;
        ans[0]=nums[0];
        ans1[0]=nums[1];
        int j=0;
        for(int i=2;i<n;i++){
            if(ans[k] > ans1[j]){
                k++;
                ans[k]=nums[i];
            }
            else {
                j++;
                ans1[j]=nums[i];
            }
        }
        j=0;
        for(int i=k+1;i<n;i++){
            ans[i]=ans1[j];
            j++;
        }
        return ans;
    }
}