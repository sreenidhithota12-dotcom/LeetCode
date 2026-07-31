class Solution {
    void find(int[] candidates, int target,List<List<Integer>> sol,int i, List<Integer> ans){
        if(i >= candidates.length){
            if(target == 0) sol.add(new ArrayList<>(ans));;
            return;
        }
        if(candidates[i] <=target){
            ans.add(candidates[i]);
            find(candidates,target - candidates[i],sol,i,ans);
            ans.remove(ans.size() - 1);
        }
        find(candidates,target,sol,i+1,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        find(candidates,target,sol,0,ans);
        return sol;
    }
}