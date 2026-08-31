class Solution {

    public void dfs( int r ,int c , char[][] grid , boolean[][] visited ){

        if( r < 0 || r >= grid.length || c < 0 || c >= grid[0].length)
            return;
        if(visited[r][c] || grid[r][c] != '1')
            return;

        visited[r][c] = true ;

        dfs( r+1 , c , grid , visited );
        dfs( r-1 , c , grid , visited );
        dfs( r , c+1 , grid , visited );
        dfs( r , c-1 , grid , visited );
        
    }
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        int count = 0;

        for( int i = 0 ; i < grid.length ; i++ ){
            for(int j = 0 ; j < grid[0].length ; j++ ){
                if(!visited[i][j] && grid[i][j] == '1'){
                    dfs( i , j , grid , visited );
                    count++;
                }
            }
        }
        return count;
    }
}