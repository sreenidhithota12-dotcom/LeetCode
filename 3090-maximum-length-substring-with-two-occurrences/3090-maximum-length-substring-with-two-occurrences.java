class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq = new int[26];
        int l=0,ans=0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            freq[c]++;
            while (freq[c] > 2) {
                freq[s.charAt(l) - 'a']--;
                l++;
            }
            ans = Math.max(ans,i-l+1);
        }

        return ans;
    }
}