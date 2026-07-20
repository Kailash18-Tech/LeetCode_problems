class Solution {
    public String convertToTitle(int columnNumber) {
        String str = "";
        while(columnNumber!=0){

            columnNumber=columnNumber-1;
            int ldigit = columnNumber%26;
            str = (char)(65+ldigit) + str;
            columnNumber/=26;
        }
        return str;
    }
}