import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int i= 0; 
        int j = n-1;
        int temp = arr[i];
        while(i <j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j ]= temp;
            i++;
            j--;
        }
        for(int l=0; l<n; l++) {
            System.out.print(arr[l]  + " ");
        }
    }
}