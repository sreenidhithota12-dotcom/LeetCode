class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int r = points.length;
        int c = 2;
        int[][] ans= new int[k][2];
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(a[0], b[0])
        );
        for(int i=0;i<r;i++){
            double dis=Math.pow(points[i][1],2) + Math.pow(points[i][0],2);
            pq.offer(new double[]{dis, i});
        }
        for(int i=0;i<k;i++){
            int index =(int) pq.poll()[1];
            ans[i][0] = points[index][0];
            ans[i][1] = points[index][1];
        }
        return ans;
    }
}