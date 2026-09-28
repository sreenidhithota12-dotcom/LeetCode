class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> l = new ArrayList<>();
        for(int x : stones){
            l.add(x);
        }
        Collections.sort(l);
        while(l.size()>1){
            int n = l.size()-1;
            int last = l.get(n);
            int sec = l.get(n-1);
            
            if(last == sec ){
                l.remove(n);
                l.remove(n-1);
            }
            else{
                l.set(n,last-sec);
                l.remove(n-1);
            }
            Collections.sort(l);
        }
        if(l.size()==1) return l.get(0);
        return 0;
    }
}