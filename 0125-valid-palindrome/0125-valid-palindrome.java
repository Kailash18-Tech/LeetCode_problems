class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        int left = 0 , right = s.length()-1;
        boolean flag = true;

        while( left < right ){

            if( (Character.isLetter(s.charAt(left)) ||Character.isDigit(s.charAt(left)))  &&
                  (Character.isLetter(s.charAt(right)) ||Character.isDigit(s.charAt(right))))  {

                    if(s.charAt(left) != s.charAt(right))
                     return false;

                    else{
                        left++;
                        right--;
                    }
            }
            else if( !(Character.isLetter(s.charAt(left)) || Character.isDigit(s.charAt(left)) ) )
              left++;

            else if( !(Character.isLetter(s.charAt(right)) || Character.isDigit(s.charAt(right)) ) )
              right--;
         
        }
        return flag;
    }
}