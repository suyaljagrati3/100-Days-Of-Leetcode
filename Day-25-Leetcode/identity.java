int row = matrix.length;
int col = matrix[0].length;
boolean identity = true;
if( row != col) {
    return false;
}
for(int i=0; i<row; i++) {
    for(int j=0; j<col; j++) {
        if( i==j && matrix[i][j] != 1) {
            identity = false;
        }
        if(i != j && matrix[i][j] != 0) {
            identity = false;
        }
        }
}
return identity;