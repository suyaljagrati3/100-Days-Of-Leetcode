class Solution {
    public int[][] transpose(int[][] matrix) {
        int ros = matrix.length;
        int cols = matrix[0].length;
        int[][] res = new int[cols][ros];
        for(int i=0; i<ros; i++) {
            for(int j=0; j<cols; j++) {
               res[j][i] = matrix[i][j];
            }
         
        }
      return res;
    }
}