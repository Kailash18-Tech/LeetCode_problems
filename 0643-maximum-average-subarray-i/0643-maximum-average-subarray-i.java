class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg =  Double.NEGATIVE_INFINITY, sum = 0;
		int left = 0 ;
		 for(int right = 0 ; right < nums.length ; right++) {

			 sum+=nums[right];
			 
			 if(k == (right - left + 1)) {
                double avg =sum / k;
				 maxAvg = Math.max(maxAvg, avg);
                //  if(nums[left] < 0 )
				//   sum+=nums[left];
                //  else
                   sum-=nums[left];
				 left++;
			 }
		 }
		 System.out.println(maxAvg);
         return maxAvg;


    }
}