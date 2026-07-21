import java.util.Hashset;
class subarray0 {
    static boolean subarray(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int prefix_sum = 0;
        for(int i=0; i< arr.length; i++) {
            prefix_sum += arr[i];
            if(prefix_sum == 0) {
                return true;
            }
            if(set.contains(prefix_sum)) {
                return true;
            }
            set.add(prefix_sum);
        }
        return false;
    }
}