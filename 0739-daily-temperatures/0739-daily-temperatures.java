class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();        
        int n = temperatures.length;
        int []ans= new int[n];
        ans[n-1]=-1;
        if(n==1) return ans;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else {
                ans[i]=st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<n;i++){
            if(ans[i]==-1) ans[i]=0;
            else ans[i]-=i;
        }
        return ans;
    }
}