class Solution {
    void find(int[] candidates, int target,List<List<Integer>> sol,int i, List<Integer> ans,int sum){
        if (i >= candidates.length || sum > target) {
            if (sum == target) {
                sol.add(new ArrayList<>(ans));
            }
            return;
        }
        ans.add(candidates[i]);
        sum += candidates[i];
        find(candidates, target, sol, i, ans, sum);
        ans.remove(ans.size() - 1);
        sum -= candidates[i];
        find(candidates, target, sol, i+1 , ans, sum);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        find(candidates,target,sol,0,ans,0);
        return sol;
    }
}