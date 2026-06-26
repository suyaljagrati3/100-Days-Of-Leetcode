class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0) {
                pos.add(nums[i]);
            }
        }
        ArrayList<Integer> neg = new ArrayList<>();
        for(int j=0; j<nums.length; j++) {
            if(nums[j] < 0) {
                neg.add(nums[j]);
            }
        }
        int[] res = new int[nums.length];
        int i = 0, j = 0, k = 0;
while(k < nums.length) {
    res[k] = pos.get(i);
    i++;
    k++;
    res[k] = neg.get(j);
    j++;
    k++;
}
return res;
    }
}