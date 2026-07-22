class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0,maxcount = 0 ;

        for(int i = 0; i < nums.length ; i++ ){
                if(nums[i]==0){
                    count = 0;
                    continue;
                }
                ++count;
                maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }
}