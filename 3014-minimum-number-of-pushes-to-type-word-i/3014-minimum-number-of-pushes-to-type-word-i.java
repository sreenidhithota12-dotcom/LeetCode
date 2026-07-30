class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n<=8) return n;
        int quo = n/8;//1
        int rem = n% 8;//2
        int ans = 0;
        for(int i = 1 ;i<=quo ;i++){
            ans += 8 *i;//8
        }
        ans += (rem) * (quo + 1);
        return ans;
    }
}