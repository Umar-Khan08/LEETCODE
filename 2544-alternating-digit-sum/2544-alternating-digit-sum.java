class Solution {
    public int alternateDigitSum(int n) {
       int rev=0;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n/=10;
        } int i=1,sum=0;       
        while(rev!=0)
        {
            int r=rev%10;
           sum= i%2==1?sum+r:sum-r;
            i++;
            rev/=10;
        } return sum;
    }
}