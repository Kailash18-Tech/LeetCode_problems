class Use{
    char c;
    int freq;

    Use( char c , int freq ){
        this.c=c;
        this.freq=freq;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Use>  st = new Stack<>();

        for( int i = 0 ; i < s.length() ; i++ ){
            
            if( !st.isEmpty() && st.peek().c == s.charAt(i) ){
                st.peek().freq++;

                if(st.peek().freq == k)
                    st.pop();
            }
            else{
                st.push(new Use(s.charAt(i),1 ));
            }

        }

        String ans = "";

        while( !st.isEmpty() ){
            Use curr = st.pop();
            int f = curr.freq;
            char ch = curr.c;
            for(int i = 0 ; i < f ; i++ ){
                ans = ch + ans ; 
            }
        }
        return ans;
    }
}