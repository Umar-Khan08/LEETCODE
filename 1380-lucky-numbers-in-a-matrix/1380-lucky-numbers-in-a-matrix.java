class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int rowmin[]=new int[m];
        int columnmax[]=new int[n];
        List<Integer> li=new ArrayList<>();
        Arrays.fill(rowmin,Integer.MAX_VALUE);
        Arrays.fill(columnmax,Integer.MIN_VALUE);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
             rowmin[i] = Math.min(rowmin[i], matrix[i][j]);
        }
          for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            columnmax[j] = Math.max(columnmax[j], matrix[i][j]);
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(rowmin[i]==matrix[i][j] && columnmax[j]==matrix[i][j]) li.add(matrix[i][j]);
            }
        } return li;
    }
}