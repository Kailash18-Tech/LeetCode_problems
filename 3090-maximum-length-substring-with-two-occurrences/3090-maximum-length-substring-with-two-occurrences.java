class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0 , right = 0 , maxlen = 0 ;
        Map<Character,Integer> mp = new HashMap<>();
        while(right<s.length()){
            mp.put(s.charAt(right),mp.getOrDefault(s.charAt(right),0)+1);

            while(mp.get(s.charAt(right))>2){
                 mp.put(s.charAt(left),mp.get(s.charAt(left))-1);
                 left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}