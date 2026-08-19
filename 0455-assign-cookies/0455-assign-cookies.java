class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length,k=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0,r=0;
        while(l<k && r<n)
        {
            if(g[r]<=s[l])
            {
                r++;
            }
            l=l+1;
        } return r;
    }
}