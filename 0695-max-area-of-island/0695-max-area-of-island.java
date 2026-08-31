class Solution {

    public int dfs( int r , int c , int[][] grid , boolean[][] visited){
        if( r < 0 || c < 0 || r >= grid.length || c >= grid[0].length)
            return 0;
        if(grid[r][c] != 1 || visited[r][c])
            return 0;

            
        visited[r][c] =true;
        int count = 1;

        count += dfs( r+1 , c , grid , visited );
        count += dfs( r-1 , c , grid , visited );
        count += dfs( r , c+1 , grid , visited );
        count += dfs( r , c-1 , grid , visited );

        return count;

    }
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int maxArea = 0 ;

        for( int i = 0 ; i < grid.length ; i++ ){
            for( int j = 0 ; j < grid[0].length ; j++ ){
                if( !visited[i][j] && grid[i][j] == 1){
                    maxArea = Math.max(maxArea , dfs( i , j , grid , visited ));
                }
            }
        } 
        return maxArea;
    }
}