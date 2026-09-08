class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastseen={-1,-1,-1};
          int cnt=0;// character end hota hai toh check karte hai ki uske pahle jitne elements hai voh kitne substrings bana rhe
          for(int i=0;i<s.length();i++)
          {
            lastseen[s.charAt(i)-'a']=i;
            if(lastseen[0]!=-1 && lastseen[1]!=-1 && lastseen[2]!=-1)
            {
                cnt=cnt+(1+Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2])));
            }
          } return cnt;
    }
}