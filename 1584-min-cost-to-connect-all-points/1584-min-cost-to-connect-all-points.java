class Solution {
    public int minCostConnectPoints(int[][] points) {

         HashMap<Integer , List<int[]>> adjlist = new HashMap<>();
         int v = points.length;

         for( int i = 0 ; i < v ; i++ ){
            adjlist.put(i,new ArrayList<>());
         }  

         for( int i = 0 ; i < v ; i++ ){
            for( int j = i+1 ; j < v ; j++ ){
                int x = Math.abs(points[i][0]-points[j][0]);
                int y = Math.abs(points[i][1]-points[j][1]);
                int w = x + y ;
                adjlist.get(i).add(new int[]{ j  , w});
                adjlist.get(j).add(new int[]{ i  , w});
            }
         }    

         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        boolean[] visited = new boolean[v];
        int minCost = 0 ;

        pq.offer(new int[]{ 0 , 0 });

        while( !pq.isEmpty() ){
            int[] curr = pq.poll();
            int node = curr[0];
            int cost = curr[1];

            if(visited[node])
                continue;

            visited[node] = true;
            minCost+=cost;

            for(int[] nei : adjlist.get(node)){
                if(!visited[nei[0]])
                    pq.offer(new int[]{nei[0],nei[1]});
            }
        }
         return minCost;
    }
}