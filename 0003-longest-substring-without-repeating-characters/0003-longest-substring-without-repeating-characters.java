class Solution {
    public int lengthOfLongestSubstring(String s) {
       
       int maxlen = 0 ; 

       for(int i = 0 ; i < s.length() ; i++ ){
         Set<Character> subseq = new HashSet<>();
         subseq.add(s.charAt(i));
         for(int j = i + 1 ; j < s.length() ; j++ ){
             if(subseq.contains(s.charAt(j)))
                break;
             else{
                subseq.add(s.charAt(j));
                maxlen = Math.max(maxlen,subseq.size());
             }
         } 
         maxlen = Math.max(maxlen,subseq.size());
       }
       return maxlen;
    }
}