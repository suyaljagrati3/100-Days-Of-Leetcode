import java.util.Scanner;
public class Key {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int found = -1;
        int comparisons = 0;
        for(int i=0; i<n; i++) {
            comparisons++;
            if(arr[i] ==target) {
               found = i;
               break;
            }
        }
          if(found != -1) {
            System.out.println("Found at index:" + found);
          } else {
            System.out.println("Not Found");
          }
          System.out.println("Comparisons: " + comparisons);
 }
    }
