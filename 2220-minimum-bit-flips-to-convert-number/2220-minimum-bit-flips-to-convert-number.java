class Solution {
    public int minBitFlips(int start, int goal) {
        int answer=start ^ goal,c=0;
        while(answer!=0)
        {
          answer=answer & (answer-1);c++;
        } return c;
    }
}