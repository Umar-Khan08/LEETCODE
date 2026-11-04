class Solution {
    public int minMoves(int[] nums) {
       int max=0;
       for(int j:nums)
       {
        if(j>max){
            max=j;
        }
       }
        int moves=0;
        for(int i:nums)
        {
           moves+=(max-i);
        } return moves;
    }
}