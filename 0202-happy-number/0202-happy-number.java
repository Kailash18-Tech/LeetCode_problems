class Solution {
    public boolean isHappy(int n) {

        int temp = n ;
        Set<Integer> set = new HashSet<>();

        while(temp != 1){

            int sqrSum = 0 ;
            n = temp;
            
            while( n > 0 ){
                int lastDigit = n%10;
                sqrSum+=lastDigit*lastDigit;
                n/=10;
            }

            if(set.contains(sqrSum))
                return false;
            else
                set.add(sqrSum);

            temp = sqrSum;
        }
        return true;
    }
}