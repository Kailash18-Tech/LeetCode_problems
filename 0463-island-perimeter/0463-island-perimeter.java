class Solution {
    public int dfs(int r , int c , boolean[][] visited , int[][] grid){

        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length)
            return 1;
        if(grid[r][c] == 0)
            return 1;
        if(visited[r][c])
            return 0;

        visited[r][c] = true;
        int count = 0;

        count += dfs(r+1 , c , visited , grid);
        count += dfs(r-1 , c , visited , grid);
        count += dfs(r , c+1, visited , grid);
        count += dfs(r , c-1 , visited , grid);

        return count;
    }
    public int islandPerimeter(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int res = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(!visited[i][j] && grid[i][j] == 1 )
                    res = dfs(i , j , visited , grid);
            }
        }
        return res;
    }
}