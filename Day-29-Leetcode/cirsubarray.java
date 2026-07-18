class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total_sum = 0;
        int circular_sum = 0;
        int curr_min = 0;
        int curr_max = 0;
        int min_sum = Integer.MAX_VALUE;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            total_sum = total_sum + nums[i];
          curr_min = curr_min + nums[i];
          curr_max = curr_max + nums[i];
            min_sum = Math.min(curr_min, min_sum);
            max_sum = Math.max(curr_max , max_sum);
            if( curr_min > 0) {
                curr_min = 0;
            }
            if( curr_max < 0) {
                curr_max = 0;
            }
        }

        if(max_sum < 0) {
            return max_sum;
        }

        circular_sum = total_sum - min_sum;

        return Math.max(circular_sum , max_sum);

    }
}