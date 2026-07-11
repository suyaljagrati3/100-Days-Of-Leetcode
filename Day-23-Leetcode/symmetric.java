import java.util.Scanner;

public class symmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        if(rows != cols) {
            System.out.print("Matrix is not a symmetric matrix");
            return;
        }

        boolean symmetric = true;

        

        int[][] matrix1 = new int[rows][cols];  //O(ros*cols)
        System.out.println("Enter elements of matrix1: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix1[i][j] = sc.nextInt();   
            }
        }


        
   for(int i=0; i<rows; i++ ) { //o(ros*cols)
    for(int j=0; j<cols; j++) {
   
        if(matrix1[i][j]!= matrix1[j][i]) {
            symmetric = false;
            break;
    }
}
    }
 if(symmetric) {
    System.out.println("Yes it is a symmetrix matrix");
 } else {
    System.out.println("It is not a symmetric matrix");
 }
}
}   