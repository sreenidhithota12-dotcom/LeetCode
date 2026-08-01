class Solution {
    void find(int n,List<List<Integer>> sol,int ind, List<Integer> ans,int k){
        if(ans.size() == k){
            if(n==0){
            sol.add( new ArrayList<>(ans));
            }
            return;
        }
        for(int i = ind ;i < 10 ; i++){
            if(i > n) break;
            ans.add(i);
            find(n-i,sol,i+1,ans,k);
            ans.remove(ans.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        int mini = k*(k+1)/2;
        if(n < mini) return new ArrayList<>();
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        find(n,sol,1,ans,k);
        return sol;
    }
}