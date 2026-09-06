class Solution {
    public int countRotations(String s, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int n = s.length();
        int sol=0;
        int j=0;
        while(j<n){
            int ans=0;
            for(int i=0;i<n-1;i++){
                if(sb.charAt(i)==sb.charAt(i+1)) ans++;
            }
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
            if(ans==k) sol++;
            j++;
        }
        return sol;
    }
}