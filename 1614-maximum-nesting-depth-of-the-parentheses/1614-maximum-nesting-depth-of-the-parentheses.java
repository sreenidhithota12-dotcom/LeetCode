class Solution {
    public int maxDepth(String s) {
        int cnt=0,ml=0;
        for(char c : s.toCharArray()){
            if(c=='(') cnt++;
            if( c==')') cnt--;
            ml=Math.max(cnt,ml);
        }
        return ml;
    }
}