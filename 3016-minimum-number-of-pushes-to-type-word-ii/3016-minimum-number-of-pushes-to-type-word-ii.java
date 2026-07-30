class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> h = new HashMap<>();
        for(char c : word.toCharArray()){
            h.put(c, h.getOrDefault(c,0) + 1);
        }
        List<Integer> freq = new ArrayList<>(h.values());
        Collections.sort(freq, Collections.reverseOrder());
        int n = freq.size();
        int quo = n/8;//1
        int rem = n% 8;//2
        int ans = 0;
        for(int i = 0 ;i<n ;i++){
            ans += freq.get(i) * (i/8 + 1);
        }
        return ans;
    }
}