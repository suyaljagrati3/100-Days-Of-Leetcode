import java.util.ArrayList;
import java.util.Scanner;
public class arrivallogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();  //O(N)
        for(int i=0; i<n; i++) {
        arr1.add(sc.nextInt()); //taking ip from user
        }
        int m = sc.nextInt();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0; i<m; i++) {
        arr2.add(sc.nextInt()); //taking ip from user
        }
        int[] res = new int[n+m];
        int i=0; int j = 0; int k =0;
        while(i < n && j < m) {
        if(arr1.get(i) < arr2.get(j)) {
            res[k] = arr1.get(i);
            i++;
            k++;
        }
        else {
            res[k] = arr2.get(j);
            j++;
            k++;
        }
 }
 while( i<n) {
    res[k] = arr1.get(i);
    i++;
    k++;
 }
 while( j <m) {
    res[k] = arr2.get(j);
    j++;
    k++;
 }
 for(int l=0; l<(n+m); l++) {
    System.out.print(res[l] + " ");
 }
    }
}