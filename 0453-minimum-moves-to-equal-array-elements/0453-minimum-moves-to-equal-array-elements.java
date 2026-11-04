class Solution {
    public int minMoves(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt(), moves = 0;
        for (int x : nums) moves += x - min;// checks how far the minimum number is from each number
        return moves;
    }
}