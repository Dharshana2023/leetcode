class Solution {
    public void rotate(int[][] a) {
        int n=a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;

            while (start < end) {
                int temp = a[i][start];
                a[i][start] = a[i][end];
                a[i][end] = temp;

                start++;
                end--;
            }
        }  
    }
}