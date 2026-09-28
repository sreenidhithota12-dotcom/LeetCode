class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        for (int x : stones) {
            pq.offer(x);
        }
        while (pq.size() > 1) {
            int last = pq.poll();
            int sec = pq.poll();
            if (last != sec) {
                pq.offer(last - sec);
            }
        }
        if(!pq.isEmpty()) return pq.poll();
        return 0;
    }
}