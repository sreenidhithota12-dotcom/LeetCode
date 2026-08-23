class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int []hash = new int [n+1];
        for(int x: nums){
            hash[x]=1;
        }
        for(int i =1;i<=n;i++){
            if(hash[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
}