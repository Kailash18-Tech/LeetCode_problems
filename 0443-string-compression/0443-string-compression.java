class Solution {
    public int compress(char[] chars) {

        String compressed = "";
        char current = chars[0];
        int count = 1;

        for (int i = 1 ; i < chars.length; i++) {
            if (current == chars[i])
                count++;
            else {
                compressed = compressed + current;
                if (count != 1)
                    compressed = compressed + count;
                current = chars[i];
                count = 1;
            }
        }
        compressed = compressed + current;
        if (count != 1)
            compressed = compressed + count;

        for(int i = 0 ; i < compressed.length() ; i++){
            chars[i] = compressed.charAt(i);
        }

        return compressed.length();
    }
}