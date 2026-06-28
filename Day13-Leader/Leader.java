class Solution {
    public List<Integer> leaders(int[] arr) {
        int n = arr.length;
        int maxRight = arr[n-1];
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(arr[n-1]);
        for(int i=n-2; i>=0; i--) {
            if(arr[i] > maxRight) {
                nums.add(arr[i]);
                 maxRight = arr[i];
            }
           
            
           
        }
         Collections.reverse(nums);
           return nums;
    }}
 