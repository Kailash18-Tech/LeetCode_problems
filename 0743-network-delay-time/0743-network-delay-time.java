class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        HashMap<Integer , List<int[]>> adjlist = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);

        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);

        for( int i = 1 ; i <= n ; i++ )
            adjlist.put(i,new ArrayList<>());

        for( int[] edge : times){
            adjlist.get(edge[0]).add(new int[]{edge[1],edge[2]});
        }

        dist[k] = 0 ;
        pq.offer(new int[]{k,0});

        while( !pq.isEmpty() ){
            int[] curr = pq.poll();

            int node = curr[0];
            int cost = curr[1];

            if(dist[node] < cost) continue;

            for( int[] nei : adjlist.get(node))
            {
                int newcost = cost + nei[1];

                if(newcost < dist[nei[0]]){
                    dist[nei[0]] = newcost;
                    pq.offer(new int[]{nei[0],newcost});
                }
            }
        }
        int ans = -1;
        for( int i = 1 ; i<= n ; i++ ){
            if(dist[i] == Integer.MAX_VALUE) return -1;

            ans = Math.max(dist[i],ans);
        }

        return ans;
    }
}