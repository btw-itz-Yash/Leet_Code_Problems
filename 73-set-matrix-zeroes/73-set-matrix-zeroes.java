class Solution {
    public void setZeroes(int[][] matrix) { 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int m=0;m<matrix[0].length;m++){
                        if(matrix[i][m]!=0 )
                            matrix[i][m]=-7909;
                    }
                    for(int n=0;n<matrix.length;n++){
                        if(matrix[n][j]!=0)
                            matrix[n][j]=-7909;
                    }
                }
            }   
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-7909)
                    matrix[i][j]=0;
            }
        }
    }
}