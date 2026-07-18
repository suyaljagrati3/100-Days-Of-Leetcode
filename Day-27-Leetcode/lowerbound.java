public class lowerbound {
    public static int lowerBound(int[] arr , int target) {
        int low = 0;
        int high = arr.length -1;
        int ans = arr.length;

        while(low <= high) {
            int mid = (low + (high-low)/2);
if(arr[mid] >= target) {
    ans = mid;
    high = mid -1;
    
}   else {
    low  = mid+ 1;
}
        }
        return ans;
    }
        public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        System.out.println(lowerBound(arr, 6)); // Output: 3
        System.out.println(lowerBound(arr, 5)); // Output: 2
        System.out.println(lowerBound(arr, 10)); // Output: 5
}

}