class Solution {
    public int minMoves(int[] nums) {
        int max=Arrays.stream(nums).max().getAsInt();
        int moves=0;
        for(int i:nums)
        {
           moves+=(max-i);
        } return moves;
    }
}