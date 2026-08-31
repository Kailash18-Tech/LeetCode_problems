class Solution {

    public void dfs(int src , int[][] graph , List<Integer> list , List<List<Integer>> ans){

        if( src == graph.length-1 ){
            ans.add(new ArrayList<>(list));
            return;
        }

        for( int pakkam : graph[src]){
            list.add(pakkam);
            dfs( pakkam , graph , list , ans);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        list.add(0);

        dfs( 0 , graph , list , ans );

        return ans;
    }
}