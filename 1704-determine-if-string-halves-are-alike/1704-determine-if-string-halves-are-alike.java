class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int cnt1=0,cnt2=0;
        int n = s.length();
        for(int i=0;i<n/2;i++){
            if ("aeiou".indexOf(s.charAt(i)) != -1) cnt1++;
            if ("aeiou".indexOf(s.charAt(n-1-i)) != -1) cnt2++;
        }
        return cnt1==cnt2;
    }
}