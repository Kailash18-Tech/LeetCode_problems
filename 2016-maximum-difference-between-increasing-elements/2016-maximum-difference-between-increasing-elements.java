class Solution {
    public int maximumDifference(int[] nums) {
        int maxi=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(maxi<nums[j]-nums[i])
                  maxi=nums[j]-nums[i];   
            }
        }
        if(maxi==0)
         return -1;
        return maxi;
    }
}