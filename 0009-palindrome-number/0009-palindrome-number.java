class Solution {
    public boolean isPalindrome(int x) {
        int temp = x ;
        int ans = 0 ;

        if( temp < 0 )
            return false;
        
        while( temp > 0 ){

            ans = ans*10 + temp%10;
            temp/=10;

        }
        return x == ans;
    }
}