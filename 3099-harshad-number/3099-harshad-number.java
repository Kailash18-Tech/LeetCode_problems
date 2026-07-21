class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int org=x;

        while(org!=0){
            int last = org % 10;
            sum+=last;
            org/=10;
        }

        return x%sum==0?sum:-1;
    }
}