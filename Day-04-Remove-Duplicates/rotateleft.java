class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;

        int temp = nums[0];

        for(int i = 1; i < nums.length-1; i++) {
            nums[i-1] = nums[i];
                
            }
        }

        nums[nums.length-1] = temp;
    }
}