class Solution {
    public boolean isToeplitzMatrix(int[][] a) {
        int m = a.length, n = a[0].length;
        for (int i = 1; i < m; i++) 
        {
            for (int j = 1; j < n; j++) 
            {
                if (a[i][j] != a[i - 1][j - 1]) return false;
            }
        }
        return true;
    }
}