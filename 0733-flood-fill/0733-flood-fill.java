class Solution {

    public void dfs(int row , int col , int[][] image , int color , int org , boolean[][] visited){
        if( row < 0 || row >= image.length || col < 0 || col >= image[0].length )
            return;
        if(visited[row][col])
            return;
        if(image[row][col] != org)
            return;
        
        visited[row][col] = true;
        image[row][col] = color;

        dfs(row+1 , col , image  , color , org , visited);
        dfs(row-1 , col , image  , color , org , visited);
        dfs(row , col+1 , image  , color , org , visited);
        dfs(row , col-1 , image  , color , org , visited);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color ) {

        boolean[][] visited = new boolean[image.length][image[0].length];
        int org = image[sr][sc];
        dfs( sr , sc , image , color , org ,visited ); 

        return image;
    }
}