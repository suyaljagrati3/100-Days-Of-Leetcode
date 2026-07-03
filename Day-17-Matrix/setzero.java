class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow=false, firstCol= false;

        //marking first row and column as true and false
        for(int i=0; i< matrix.length; i++) { //going through row
            for(int j=0; j<matrix[0].length; j++) { //going through column
                if(matrix[i][j] == 0) {
                    if(i == 0) firstRow = true;
                    if( j==0) firstCol = true;
                    matrix[0][j] = 0; //will set all the element of column as 0
                    matrix[i][0] = 0; 
                }
            }
        }

                //for inner matrix
                for(int i=1; i<matrix.length; i++) {
                    for(int j=1; j<matrix[0].length; j++) {
                        if(matrix[i][0] ==0 || matrix[0][j] == 0) {
                            matrix[i][j] = 0;
                        }
                    }
                }

                        if(firstRow) {
                            for(int j=0; j<matrix[0].length; j++) { //checking for column as a row contain column
                                matrix[0][j] = 0;
                            }
                            if(firstCol) {
                                for(int i=0; i<matrix.length; i++) {
                                    matrix[i][0] = 0;
                                }
                            }
                        }
                    }
}
        
    