class Solution {
    public boolean areOccurrencesEqual(String s) {

        boolean flag = true;

        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++ ){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int freq = map.get(s.charAt(0));

        for(char key : map.keySet()){
            if(freq != map.get(key))
             flag = false;
        }
        return flag;
    }
}