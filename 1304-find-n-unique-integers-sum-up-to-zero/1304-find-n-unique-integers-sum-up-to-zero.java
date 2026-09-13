class Solution {
    public int[] sumZero(int n) {
         int[] ans=new int[n];
        int x=0;
        for(int i=0;i<n/2;i++){
            ans[x++]=i+1;
            ans[x++]=-(i+1);
        }
        if(n%2!=0)
            ans[x]=0;
        return ans;
    }
}