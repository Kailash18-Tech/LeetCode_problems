class Solution {
    public int findMin(int[] nums) {
        int left = 0, right =nums.length-1,min=nums[0];

        while( left <= right){

            int mid = (right- left)/2+left;
            min = Math.min(min,nums[mid]);
            if(nums[mid] > nums[right])
              left = mid+1;
            else
              right = mid-1;
        }
        return min;
    }
}