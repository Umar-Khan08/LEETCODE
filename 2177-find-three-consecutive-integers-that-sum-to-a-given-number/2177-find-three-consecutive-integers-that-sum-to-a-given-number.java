class Solution {
    public long[] sumOfThree(long num) {
        long start=(num-3)/3;
        if((start+start+1+start+2)==num)
        return new long[]{start,start+1,start+2};
        return new long[0];
    }
}