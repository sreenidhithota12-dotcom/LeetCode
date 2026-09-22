class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int hash1[] = new int[101];
        int hash2[] = new int[101];
        List<Integer> ans = new ArrayList<>();
        for(int x:nums1){//122
            if(hash1[x]==1) continue;
            hash1[x]++;
        }
        for(int x:nums2){
            if(hash2[x]==1) continue;
            hash2[x]++;
            if(hash1[x]==1) ans.add(x);
        }
        for(int x: nums3){
            if(hash1[x]==1 && hash2[x]==1) continue;
            if((hash1[x]==1 || hash2[x]==1) && !ans.contains(x)) ans.add(x);

        }
        
        return ans;
    }
}