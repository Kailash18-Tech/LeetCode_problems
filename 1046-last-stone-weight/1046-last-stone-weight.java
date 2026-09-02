class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
       
        for( int i = 0 ; i < stones.length ; i++ )
           pq.offer(stones[i]);

        while(pq.size() > 1){
            int fmax = pq.poll();
            int smax = pq.poll();
            int newWeight = fmax -smax;
            if(newWeight != 0)
                pq.offer(newWeight);
        }
        return pq.isEmpty()? 0 : pq.poll();
    }
}