class Solution {

    static void recur(int left , int right , String s , ArrayList<String> result , int n){
        if(s.length() == 2*n){
            result.add(s);
            return;
        }
        if( left < n )
           recur( left+1,right,s+"(",result , n );
        if(right<left)
           recur( left , right+1 , s+")" , result , n);
    }



    public List<String> generateParenthesis(int n) {

        ArrayList<String> result = new ArrayList<>();

         recur( 0 , 0 , "" , result , n);
         return result;
         


    }
}