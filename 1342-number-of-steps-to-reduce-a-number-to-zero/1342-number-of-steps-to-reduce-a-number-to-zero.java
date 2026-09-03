class Solution {
    public int numberOfSteps(int n) {
        int c=0; 
        if(n%2==1) {
            n=n-1;
            c++;
        }
        while(n>0)
        {
            n/=2;
            if(n%2==1) {n-=1; c++;}
            c++;
        } return c;
    }
}