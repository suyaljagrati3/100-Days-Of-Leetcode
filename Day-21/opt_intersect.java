class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int num: nums1){
            map.put(num, map.getOrDefault(num,0)+1); //    
    //if number is going to be added for the first time then it will add num otherwise if number is already there it will inc the count
        }
      for(int num:nums2) {
        if(map.containsKey(num) && map.get(num)>0) {  //value should be grater then 0 otherwise it no longer exists in array
            list.add(num);
            map.put(num,map.get(num)-1);
        }
      }
      int[] result = new int[list.size()];
     for(int i=0; i<list.size(); i++) {
      result[i] = list.get(i);
     }
      return result;
        }

    }
