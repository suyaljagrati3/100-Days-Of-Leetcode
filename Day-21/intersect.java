class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      int  n = nums1.length;
      int  m = nums2.length;
      int k = 0;
      int[] res = new int[m+n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(nums1[i] == nums2[j]) {
                    res[k] = nums1[i];
                    k++;
                    nums2[j] = -1;
                    break;
                }
            }

        }
       return Arrays.copyOfRange(res , 0 , k);
    }
    
}