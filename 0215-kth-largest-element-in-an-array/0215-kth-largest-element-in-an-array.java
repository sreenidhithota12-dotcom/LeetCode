class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int x: nums){
            pq.offer(x);
        }
        int n = nums.length;
        k=n-k;
        while(k>0){
            k--;
            pq.poll();
        }
        return pq.poll();
    }
}