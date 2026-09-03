class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for( int  i = 0 ; i < s.length() ; i++ ){
            st1.push(s.charAt(i));
        }

        while( !st1.isEmpty() ){


            if( st2.isEmpty() )
               st2.push(st1.pop());
            if(st1.isEmpty())
             break;
            char first = st1.pop(); 
            char sec =  st2.peek();

            if( sec == first )
               st2.pop();
            else
               st2.push(first);
        }

        int size = st2.size();
        String res = "";
        
        for( int i = 0 ; i < size ; i++ )
          res = res + st2.pop();
         
        
        return res;
    }
}