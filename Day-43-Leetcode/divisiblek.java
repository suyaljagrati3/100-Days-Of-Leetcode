class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum =0;
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            int rem = ((sum % k) + k) % k; //Changing negative remainders into positive
            if (map.containsKey(rem)) {
                //add the frequency
                count += map.get(rem);
                  map.put(rem, map.get(rem) + 1);

            } else {
                map.put(rem , 1);
            }
        } 
        return count;
    }
}