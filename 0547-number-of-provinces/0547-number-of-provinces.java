class Solution {

    static void dfs(int node , boolean[] visited
			,HashMap<Integer,List<Integer>> adjList) {
				
		visited[node] = true;
		System.out.print(node+" => ");
		for( int nei : adjList.get(node)) {
			if(!visited[nei])
				dfs(nei,visited,adjList);
		}
	}

    public int findCircleNum(int[][] isConnected) {
        HashMap<Integer , List<Integer>> adjlist = new HashMap<>();

        for(int i = 1 ; i <= isConnected.length ; i++ ){
            adjlist.put(i,new ArrayList<>());
        }
        int count = 0 ;

        for(int i = 0 ; i < isConnected.length ; i++ ){
            for(int j = 0 ; j < isConnected.length ; j++ ){
                if( isConnected[i][j] == 1  )
                   adjlist.get(i+1).add(j+1);
            }
        }

        boolean[] visited = new boolean[isConnected.length+1];

        for(int i = 1 ; i < isConnected.length+1 ; i++ ){
            if(!visited[i]){
                count++;
                dfs( i , visited , adjlist);
            }
        }
        return count;
    }
}