class Solution {
    void find(int[] candidates, int target,List<List<Integer>> sol,int ind, List<Integer> ans){
        if(target == 0){
            sol.add( new ArrayList<>(ans));
            return;
        }
        for(int i = ind ;i < candidates.length ; i++){
            if(i>ind && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;
            ans.add(candidates[i]);
            find(candidates,target-candidates[i],sol,i+1,ans);
            ans.remove(ans.size() - 1);
            }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> sol = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> ans = new ArrayList<>();
        find(candidates,target,sol,0,ans);
        return sol;
    }
}