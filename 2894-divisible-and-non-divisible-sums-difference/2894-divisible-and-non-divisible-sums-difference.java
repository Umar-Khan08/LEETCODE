class Solution {
    public int differenceOfSums(int n, int m) {
       int sum=(n*(n+1)/2);
       for(int i=m;i<=n;i=i+m)
       {
        sum-=i*2;
       } return sum;
    }
}