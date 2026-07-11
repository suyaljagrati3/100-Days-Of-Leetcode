class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rowbegin = 0;
        int rowned = matrix.length-1;
        int colbegin = 0;
        int colend = matrix[0].length - 1;
        while(rowbegin<= rowned && colbegin <= colend) {
            //Traversing right
            for(int j = colbegin; j<=colend; j++) {
                ans.add(matrix[rowbegin][j]);
            }
            rowbegin++;

            //moving down
            for(int i = rowbegin; i<= rowned; i++) {
                ans.add(matrix[i][colend]);
               
            }
            colend--;

            //traversing left
            if(rowbegin <= rowned) {
                for(int j= colend; j>=colbegin; j--) {
                    ans.add(matrix[rowned][j]);

                }
            
            rowned--;
            }

            //traversing up
            if(colbegin <= colend) {
                for(int i=rowned; i>=rowbegin; i--) {
                    ans.add(matrix[i][colbegin]);
                }
                colbegin++;
            }

        }
return ans;

        
    }
}