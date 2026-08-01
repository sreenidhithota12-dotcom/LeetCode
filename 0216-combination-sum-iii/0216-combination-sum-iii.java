class Solution {
    void find(int[] arr, int n,List<List<Integer>> sol,int ind, List<Integer> ans,int k){
        if(ans.size() == k){
            if(n==0){
            sol.add( new ArrayList<>(ans));}
            return;
        }
        for(int i = ind ;i < arr.length ; i++){
            if(arr[i] > n) break;
            ans.add(arr[i]);
            find(arr,n-arr[i],sol,i+1,ans,k);
            ans.remove(ans.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int mini = k*(k+1)/2;
        if(n < mini) return new ArrayList<>();
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        find(arr,n,sol,0,ans,k);
        return sol;
    }
}