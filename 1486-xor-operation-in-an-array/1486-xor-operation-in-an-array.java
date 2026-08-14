class Solution {
    public int xorOperation(int n, int start) {
        int ans=0;int nums=0;
        for(int i=0;i<n;i++)
        {
            nums=start+2*i;
            ans=ans^nums;
        } return ans;
    }
}