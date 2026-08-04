class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int s=nums.length;
        int mini=Integer.MAX_VALUE ;
        int maxi=Integer.MIN_VALUE ;
        List<Integer> sol = new ArrayList<>();
        for(int x:nums){
            mini=Math.min(mini,x);
            
            maxi=Math.max(maxi,x);
        }
        if(maxi - mini + 1 == s) return new ArrayList<>();
        int[] found = new int [maxi+1];
        for(int x : nums){
            found[x]++;
        }
        for(int j=mini+1;j<maxi;j++){
            if (found[j]==0) {
                sol.add(j);
            }
        }
        return sol;
    }
}