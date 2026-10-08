class Solution {
    public String removeOuterParentheses(String s) {
        if (s.length()<3) return "";
        int n=s.length();
        int count=-1;
        int mark=0;
        StringBuilder sol=new StringBuilder();
        for(int i=0;i<n;i++) {
            if (count==-1) {
                mark=i;
                count=0;
            } 
            else if (s.charAt(i)=='(') count++;
            else if (s.charAt(i)==')') count--;
            if (count < 0) {
                sol.append(s.substring(mark+1,i));
                count=-1;
            }
        }
        return sol.toString();
    }
}