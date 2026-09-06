class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = jewels.length();
        int m = stones.length();
        int ans=0;
        for(int i=0;i<m;i++){
            int j=0;
            while(j<n){
                if(stones.charAt(i)==jewels.charAt(j)) ans++;
                j++;
            }
        }
        return ans;
    }
}