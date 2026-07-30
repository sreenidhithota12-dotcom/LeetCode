class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        char[] chars = word.toCharArray();
        for(char c : chars){
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        int ans = 0;
        int val = 0;

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;
            ans += freq[i] * (val / 8 + 1);
            val++;
        }

        return ans;
    }
}