class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0,index = k,current = 0;
        while (tickets[index] > 0)
         {
            if (tickets[current] > 0) 
            {
                tickets[current]--;
                time++;
            }
            current++;
            if (current == tickets.length) 
            {
                current = 0;
            }
        }
        return time;
    }
}