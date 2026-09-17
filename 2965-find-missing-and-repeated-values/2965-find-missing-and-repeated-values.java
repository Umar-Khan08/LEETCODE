class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length;
        int rep = 0, miss = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(set.contains(grid[i][j]))
                    rep = grid[i][j];
                set.add(grid[i][j]);
            }
        }
        for(int i=1;i<=n*n;i++) {
            if(!set.contains(i)) {
                miss = i;
                break;
            }
        }
        return new int[]{rep, miss};
    }
}