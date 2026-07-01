int j = 0;
for(int i=0; i<n; i++) {
    if(nums[i] <= nums[j]) {
        nums[i] = nums[j];
        
    }
}