class Solution {
        void find(int[] nums, List<List<Integer>> sol,boolean freq[], List<Integer> ans){
        if(ans.size() == nums.length){
            sol.add( new ArrayList<>(ans));
            return;
        }
        for(int i = 0 ;i < nums.length ; i++){
            if(!freq[i]){
            freq[i]=true;
            ans.add(nums[i]);
            find(nums,sol,freq,ans);
            ans.remove(ans.size() - 1);
            freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        find(nums,sol,freq,ans);
        return sol;
    }
}