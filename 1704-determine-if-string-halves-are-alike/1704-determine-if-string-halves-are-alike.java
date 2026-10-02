class Solution {
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int cnt1=0,cnt2=0;
        int n = s.length();
        for(int i=0;i<n/2;i++){
            char c1=s.charAt(i);
            if (c1 == 'a' || c1=='e' ||c1=='i'|| c1=='o' ||c1=='u') cnt1++;
            c1=s.charAt(n-1-i);
            if (c1 == 'a' || c1=='e' ||c1=='i'|| c1=='o' ||c1=='u') cnt2++;
        }
        return cnt1==cnt2;
    }
}