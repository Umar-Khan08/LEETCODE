class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0,p=1;
        while(temp!=0)
        {
           sum+=temp%10;
           p*=temp%10;
           temp/=10;
        } return n % (sum+p)==0;
    }
}