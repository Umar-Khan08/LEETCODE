class Solution {
    public boolean isHappy(int n) {
    int k=n ;
     while(k!=1 && k!=4)  {
        n=k;int sum=0;
     while(n!=0)
        {
            int r=n%10;
            sum=sum+r*r;
            n/=10;
        } k=sum;
    }
    return k==1? true:false;}
}