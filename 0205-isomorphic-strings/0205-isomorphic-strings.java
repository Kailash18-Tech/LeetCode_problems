class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        Map<Character, Character> iso = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!iso.containsValue(t.charAt(i)))
                iso.put(s.charAt(i), t.charAt(i));
            else
                continue;
        }

        String res = "";

        for(int j = 0; j < s.length() ; j++){
            res+=iso.get(s.charAt(j));
        }
        return t.equals(res);
    }
}