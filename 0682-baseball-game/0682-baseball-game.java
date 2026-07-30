class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(String s : operations ){
            
            switch (s){
                case "+":
                  int fTop = st.pop();
                  int sTop = st.pop();
                  st.push(sTop);
                  st.push(fTop);

                  int sum = fTop  + sTop;
                  st.push(sum);
                  break;
                case "D" :
                  st.push(2*st.peek());
                  break;
                case "C":
                  st.pop();
                  break;
                default :
                  st.push(Integer.parseInt(s));

            }
           
            
        }
         int res = 0 ;

        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;

    }
}