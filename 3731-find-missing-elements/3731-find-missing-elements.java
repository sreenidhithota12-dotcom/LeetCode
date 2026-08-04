class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int s=nums.length;
        int mini=Integer.MAX_VALUE ;
        int maxi=Integer.MIN_VALUE ;
        List<Integer> sol = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for(int x:nums){
            mini=Math.min(mini,x);
            pre.add(x);
            maxi=Math.max(maxi,x);
        }
        if(maxi - mini + 1 == s) return new ArrayList<>();
        for(int j=mini+1;j<maxi;j++){
            if (!pre.contains(j)) {
                sol.add(j);
            }
        }
        return sol;
    }
}