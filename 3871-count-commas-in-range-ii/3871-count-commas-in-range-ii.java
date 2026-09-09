class Solution {
    public long countCommas(long n) {
        long cnt =0;
        long l=1000;
        while(l<=n)
        {
            cnt+=(n-l+1);
            l*=1000;
        } return cnt;
    }
}