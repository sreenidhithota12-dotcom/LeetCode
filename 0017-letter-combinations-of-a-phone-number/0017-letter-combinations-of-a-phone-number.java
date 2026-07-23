class Solution {
    void find(String arr[],String digits,List<String> ans,StringBuilder sb,int n,int c){
        if(c==n){
            ans.add(sb.toString());
            return;
        }
        for(char ch:arr[digits.charAt(c)-'0'].toCharArray()){
            sb.append(ch);
            find(arr,digits,ans,sb,n,c+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        int n=digits.length();
        
        String[] arr = new String[10];
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        arr[2] = "abc";
        arr[3] = "def";
        arr[4] = "ghi";
        arr[5] = "jkl";
        arr[6] = "mno";
        arr[7] = "pqrs";
        arr[8] = "tuv";
        arr[9] = "wxyz";
        find(arr,digits,ans,sb,n,0);
        return ans;
    }
}