class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        solve(s,0,path,ans);
        return ans;
    }
    void solve(String s,int ind,List<String> path, List<List<String>> ans){
        if(ind==s.length()){
            ans.add( new ArrayList<>(path));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(pal(s,ind,i)){
                path.add(s.substring(ind,i+1));
                solve(s,i+1,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
    boolean pal(String s,int st,int end){
        while(st<=end){
            if(s.charAt(st)!=s.charAt(end)) return false;
            st++;
            end--;
        }
        return true;
    }
}