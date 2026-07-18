public class upperbound {
    public static int upperbound(int[] arr , int target) {
        int low = 0;
        int high = arr.length -1;
        int ans = arr.length;

        while(low <= high) {
            int mid = (low + (high-low)/2);
if(arr[mid] <= target) {
    low  = mid+ 1;
    
}   else {
    
    ans = mid;
    high = mid -1;
}
        }
        return ans;
    }
        public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        System.out.println(upperbound(arr, 6)); 
        System.out.println(upperbound(arr, 5)); 
        System.out.println(upperbound(arr, 10)); 
}

}