class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        int left = 0 , boat = 0 , right = people.length-1;

        while(left < right){
            if(people[left] + people[right] > limit){
                boat++;
                right--;
            }
            else{
                boat++;
                left++;
                right--;
            }
            if(left == right )
              boat++;
        }
        return boat;

    }
}