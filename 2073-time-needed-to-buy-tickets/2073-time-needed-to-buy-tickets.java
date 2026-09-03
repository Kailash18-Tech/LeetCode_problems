class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();

        int time = 0 ;
        int n = tickets.length;

        for( int i = 0 ; i < n ; i++ )
            q.offer(i);
        
        while( !q.isEmpty() ){
            int firstperson = q.poll();
            time++;
            tickets[firstperson]--;
            
            if( firstperson == k &&  tickets[firstperson] == 0 ){
               break;
            }
            else if (  tickets[firstperson] > 0){
                q.offer(firstperson);
            }
           
        }
        return time;
    }
}