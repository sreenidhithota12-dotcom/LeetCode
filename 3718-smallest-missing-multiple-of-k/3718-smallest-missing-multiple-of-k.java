class Solution {
    public int missingMultiple(int[] nums, int k) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        List<Integer> l = new ArrayList<>();
        for(int x:nums){
            if(x % k==0){
                l.add(x/k);
                mini=Math.min(x,mini);
                maxi=Math.max(x,maxi);
            }
        }
        mini=mini/k;
        maxi=maxi/k;
        if(mini!=1) return k;
        for(int i=mini+1;i<maxi;i++){
            if(!l.contains(i)) return k*i;
        }
        return k*(maxi+1);
    }
}