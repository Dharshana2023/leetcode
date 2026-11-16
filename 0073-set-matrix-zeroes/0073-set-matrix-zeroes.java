class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;

        HashSet<Integer> r_set=new HashSet<>();
        HashSet<Integer> c_set=new HashSet<>();
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    r_set.add(i);
                    c_set.add(j);
                }
            }
         }

         for(int i:r_set){
            for(int j=0;j<c;j++){
                matrix[i][j]=0;
            }
         }
         for(int j:c_set){ 
           for(int i=0;i<r;i++){
                matrix[i][j]=0;
            }
           }

    }
}