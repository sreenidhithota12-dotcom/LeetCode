class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        int n =nums.length;
        int hash[] = new int[upper-lower+1];
        for(int x:nums){
            if(x>=lower && x<=upper) hash[x-lower]=1;
        }
        int i=lower;
        List<List<Integer>> sol =  new ArrayList<>();
        while(i<=upper){
            List<Integer> ans = new ArrayList<>();
            if(hash[i-lower]==0){
                ans.add(i);
                int j=i+1;
                while(j<=upper && hash[j-lower]==0 ){
                    j++;
                }
                ans.add(j-1);
                sol.add(ans);
                i=j+1;
            }
            else i++;
        }
        return sol;
    }
}