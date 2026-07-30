class Solution {
    public int[] finalPrices(int[] prices) {
        
        Stack<Integer> st = new Stack<>();
        int[] answer = new int[prices.length];

        for(int i = prices.length-1 ; i>=0 ; i-- ){

            while(!st.isEmpty() && prices[i] < st.peek())
             st.pop();

             answer[i] = st.isEmpty()?prices[i]:prices[i]-st.peek();
             
             st.push(prices[i]);
        }
        return answer;
    }
}