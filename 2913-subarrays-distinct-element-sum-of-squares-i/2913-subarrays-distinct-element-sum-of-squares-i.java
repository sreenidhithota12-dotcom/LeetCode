class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int ans = 0;
        for(int i=0;i<n;i++){
            int count=0;
            int vis[] = new int[101];
            for(int j=i;j<n;j++){
                int val=nums.get(j);
                if(vis[val]==0){
                    vis[val]=1;
                    count++;
                }
                ans+=count*count;
            }
        }
        return ans;
    }
}