class Solution {
    public boolean check(int[] nums) {
        int warning = 0;
        
        for(int i = 0; i < nums.length ; i++){
            if(nums[(i+1)%nums.length]<nums[i])
               warning++;
        }
        return warning<2;
    }
}