class Solution {
        void find(int[] nums, List<List<Integer>> sol,int ind){
        if(ind == nums.length){
            List<Integer> ans = new ArrayList<>();
            for(int n : nums){
                ans.add(n);
            }
            sol.add( new ArrayList<>(ans));
            return;
        }
        for(int i = ind ;i < nums.length ; i++){
            swap(nums,ind,i);
            find(nums,sol,ind+1);
            swap(nums,ind,i);
        }
    }
        void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            return;
        }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        find(nums,sol,0);
        return sol;
    }
}