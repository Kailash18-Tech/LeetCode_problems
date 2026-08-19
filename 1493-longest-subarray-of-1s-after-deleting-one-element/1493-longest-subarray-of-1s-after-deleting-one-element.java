class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0 , right = 0 ; 
        int maxlen = 0 , excuse = 0 ;

        while(right < nums.length){
            if(nums[right] == 0){
                excuse++;
            }
            while(excuse > 1){
                if(nums[left] == 0)
                    excuse--;
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
            right++;
        } 
        return maxlen-1;
    }
}